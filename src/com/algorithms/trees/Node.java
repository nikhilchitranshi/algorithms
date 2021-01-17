package com.algorithms.trees;

public class Node 
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