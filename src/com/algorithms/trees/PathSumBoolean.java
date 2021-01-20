package com.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
 */

public class PathSumBoolean {

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
		
		System.out.println(new PathSumBoolean().hasPathSum(tree, 22));
		
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

		if (root.val == sum && root.left == null && root.right == null) {
			return true;
		}

		boolean hasLeft = hasPathSum(root.left, sum - root.val);
		boolean hasRight = hasPathSum(root.right, sum - root.val);

		return hasLeft || hasRight;
	}

}
