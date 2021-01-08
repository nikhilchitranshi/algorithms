package com.algorithms.stacks;

import java.util.Stack;

/*
1598. Crawler Log Folder
Easy

137

15

Add to List

Share
The Leetcode file system keeps a log each time some user performs a change folder operation.

The operations are described below:

"../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
"./" : Remain in the same folder.
"x/" : Move to the child folder named x (This folder is guaranteed to always exist).
You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.

The file system starts in the main folder, then the operations in logs are performed.

Return the minimum number of operations needed to go back to the main folder after the change folder operations.
*/


public class FolderCrawler {
	
	public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<String>();
        for(String log : logs){
            
            if(!stack.empty() && log.equals("../")){
                stack.pop();
            
            }else if(log.equals("./") || (stack.empty() && log.equals("../"))){
                //stack.peek();
            
            }else{
                stack.push(log);
            }           
        }
        return stack.size();
    }

}
