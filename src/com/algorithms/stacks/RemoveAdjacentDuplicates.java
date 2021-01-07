package com.algorithms.stacks;

import java.util.Stack;

/*
1047. Remove All Adjacent Duplicates In String
Easy

1218

88

Add to List

Share
Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.

 

Example 1:

Input: "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
*/

public class RemoveAdjacentDuplicates {
	
public String removeDuplicates(String S) {
        
        Stack<Character> stack = new Stack<Character>();
        //StringBuilder result = new StringBuilder();
        
        if(S.length() == 0 || S.equals("")){
            return "";
        }
        
        stack.push(S.charAt(0));
        
        for(int i=1; i<S.length(); i++){
            if(!stack.empty() && S.charAt(i) == stack.peek()){
                stack.pop();
            
            }else{
                stack.push(S.charAt(i));
            }
        }
        
        char[] result = new char[stack.size()];
        for(int i = result.length -1; i >= 0; i--)
        {
            result[i] = stack.pop();
        }

        return new String(result);
        
    }

}
