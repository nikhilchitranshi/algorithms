package com.algorithms.stacks;

import java.util.Stack;

/*
 ["MinStack","push","push","push","push","pop","getMin","pop","getMin","pop","getMin"]
[[],[512],[-1024],[-1024],[512],[],[],[],[],[],[]]
 */

public class MyMinStack {
	
	public static void main(String[] args) {
		MinStack stack = new MinStack();
		
		stack.push(512);
		stack.push(-1024);
		stack.push(-1024);
		stack.push(512);
		
		stack.pop();
		stack.getMin();
		
		stack.pop();
		stack.getMin();
		
		stack.pop();
		stack.getMin();
		
		
		
	}
	
}

class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> minStack;
    
    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);        
        if(minStack.empty() || x<=minStack.peek()){
            minStack.push(x);
        }
    }
    
    public void pop() {
        if(minStack.peek() == stack.peek()){
            minStack.pop();
        }
        
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}