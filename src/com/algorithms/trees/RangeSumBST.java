package com.algorithms.trees;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumBST {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		
		TreeNode node5 = new TreeNode(5);
		TreeNode node15 = new TreeNode(15);
		
		root.left = node5;
		root.right = node15;
		
		TreeNode node3 = new TreeNode(3);
		TreeNode node7 = new TreeNode(7);
		
		node5.left = node3;
		node5.right = node7;
		
		TreeNode node13 = new TreeNode(13);
		TreeNode node18 = new TreeNode(18);
		node15.left = node13;
		node15.right = node18;
		
		TreeNode node1 = new TreeNode(1);
		node3.left = node1;
		
		TreeNode node6 = new TreeNode(6);		
		node7.left = node6;
				
		new RangeSumBST().levelOrderTraverse(root, 6, 10);
	}
	
	public int levelOrderTraverse(TreeNode root, int low, int high){
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            TreeNode temp= queue.poll();
            
            if(temp.val >= low && temp.val <= high){
                sum += temp.val;
            }
            
            if(temp.val > low && temp.val < high){
                if(temp.left != null ) {
                		queue.add(temp.left);
                }
                if(temp.right != null) {
                		queue.add(temp.right);
                }
                
            
            }else if(temp.val <= low && temp.val <high && temp.right !=null){
                queue.add(temp.right);
            
            }else if(temp.val > low && temp.val >= high && temp.left != null){
                queue.add(temp.left);
            }
            
        }
        return sum;
    }
}




 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
      
      public String toString() {
    	  	return "[node = "+val+"]";
      }
  }
 