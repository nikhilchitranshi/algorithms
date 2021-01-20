package com.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

public class RootToLeaf {

	List<String> res;
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.right = new TreeNode(5);
		
		System.out.println(new RootToLeaf().binaryTreePaths(tree));
	}

	public List<String> binaryTreePaths(TreeNode root) {
		
		
		
		res = new ArrayList();
		if (root == null)
			return res;
		printTree(root, new StringBuilder());
		return res;
	}

	private void printTree(TreeNode node, StringBuilder soFar) {
		System.out.println(node);
		int size = soFar.length();
		soFar.append(node.val);
		// Base case - Leaf Nodes
		if (node.left == null && node.right == null)
			res.add(soFar.toString());
		// Recursive case - Internal Nodes
		soFar.append('-').append('>');
		if (node.left != null)
			printTree(node.left, soFar);
		if (node.right != null)
			printTree(node.right, soFar);
		soFar.delete(size, soFar.length());
	}

}
