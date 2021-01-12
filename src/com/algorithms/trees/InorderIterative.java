package com.algorithms.trees;

import java.util.Stack;

public class InorderIterative {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		//tree.inorderIterative(tree.root);
		tree.inorderRecursive(tree.root);
	}
}



class BinaryTree{
	Node root;
	
	void inorderIterative(Node root) {
		
		Stack<Node> stack = new Stack<>();
		Node curr = root;
		
		while(curr != null || stack.size()>0) {
			
			if(curr != null) {
				stack.push(curr);
				curr = curr.left;
			}else {
				Node temp = stack.pop();
				System.out.println(temp.data);
				curr = temp.right;
			}		
		}		
	}
	
	void inorderRecursive(Node node) {
		System.out.println("Inorder of : "+node);
		if(node == null)
			return;
		
		inorderRecursive(node.left);
		System.out.println("Printing the value : "+node.data);
		inorderRecursive(node.right);
	}
}

class Node 
{ 
    int data; 
    Node left, right; 
  
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    }
    
    public String toString() {
    		return "[val ="+ data+"]";
    }
} 
