package com.algorithms.stacks;

import java.util.Stack;

public class BaseballGame {
	
	public static void main(String[] args) {
		new BaseballGame().calPoints(new String[] {"5","2","C","D","+"});
	}
	
	public int calPoints(String[] ops) {
        int result = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(String op : ops){
            
            if(op.equals("C")){
                stack.pop();
                
            }else if(op.equals("D")){
                stack.push(2*stack.peek());
            
            }else if(op.equals("+")){
            		int prev1 = stack.peek();
            		int popped = stack.pop();
            		int prev2 = stack.peek();
            		stack.push(popped);
                stack.push(prev1+prev2);
            
            }else{
                stack.push(Integer.parseInt(op));
            }
            
        }
        
        while(!stack.empty())
            result += stack.pop();
        
        return result;
        
    }

}
