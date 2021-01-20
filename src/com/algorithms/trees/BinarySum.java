package com.algorithms.trees;

public class BinarySum {
	
	Integer sum = 0;
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		
		tree.left = new TreeNode(0);
		tree.left.left = new TreeNode(0);
		tree.left.right = new TreeNode(1);
		
		
		tree.right = new TreeNode(1);
		tree.right.left = new TreeNode(0);
		tree.right.right = new TreeNode(1);
		
		System.out.println(new BinarySum().sumRootToLeaf(tree));
			
		
	}

	public int sumRootToLeaf(TreeNode root) {

		if (null == root)
			return 0;

		
		traverse(root, 0);
		return sum;

	}

	void traverse(TreeNode node, int num) {

		num = 2 * num + node.val;

		if (node.left == null && node.right == null) {
			sum += num;
			return;
		}

		if (node.left != null)
			traverse(node.left, num);

		if (node.right != null)
			traverse(node.right, num);

		num = num / 2;

	}

}
