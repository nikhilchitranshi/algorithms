package com.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
	List<List<Integer>> ans = new ArrayList<>();
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(5);
		
		tree.left = new TreeNode(4);
			
		tree.left.left = new TreeNode(11);
		tree.left.left.left = new TreeNode(7);
		tree.left.left.right = new TreeNode(2);
		
		tree.right = new TreeNode(8);
		tree.right.left = new TreeNode(13);
		tree.right.right = new TreeNode(4);
		tree.right.right.left = new TreeNode(5);
		tree.right.right.right = new TreeNode(1);
		
		System.out.println(new PathSum().pathSum(tree, 22));
		
	}

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if (null == root)
			return ans;

		List<Integer> list = new ArrayList<Integer>();
		pathSum(root, list,0, targetSum);
		return ans;
	}

	void pathSum(TreeNode node, List<Integer> list,int initial, int targetSum) {
		list.add(node.val);
		initial+= node.val;

		if (node.left == null && node.right == null && initial == targetSum) {
			ArrayList<Integer> sumList = new ArrayList<Integer>();
			sumList.addAll(list);
			ans.add(sumList);
		}

		if (null != node.left)
			pathSum(node.left, list,initial, targetSum);

		if (null != node.right)
			pathSum(node.right, list,initial, targetSum);

		list.remove(list.size() - 1);

	}

}
