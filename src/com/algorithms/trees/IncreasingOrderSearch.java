package com.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
Example 1:

Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
*/

public class IncreasingOrderSearch {

	TreeNode ans = new TreeNode(0);
	List<Integer> list = new ArrayList<>();

	public TreeNode increasingBST(TreeNode root) {
		TreeNode curr = ans;
		inOrder(root);
		for (Integer num : list) {
			TreeNode node = new TreeNode(num);
			curr.right = node;
			curr = node;
		}
		return ans.right;
	}

	public void inOrder(TreeNode root) {

		if (root == null) {
			return;
		}

		inOrder(root.left);
		list.add(root.val);
		inOrder(root.right);

	}

}
