package com.algorithms.string;

import java.util.ArrayList;
import java.util.List;

//Balanced strings are those who have equal quantity of 'L' and 'R' characters.
//
//Given a balanced string s split it in the maximum amount of balanced strings.
//
//Return the maximum amount of splitted balanced strings.
//
// 
//
//Example 1:
//
//Input: s = "RLRRLLRLRL"
//Output: 4
//Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
//Example 2:
//
//Input: s = "RLLLLRRRLR"
//Output: 3
//Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'

public class SplitBalancedString {
	
	public static void main(String[] args) {
		for(String s : balancedStringSplit("LRLLLRRRRL")) {
			System.out.println(s);
		}
	}
	
	public static List<String> balancedStringSplit(String s) {
        char []charArray = s.toCharArray();
        
        int balance = 0;
        String substr = "";
        List<String> output = new ArrayList<String>();
        
        for(int i=0; i<charArray.length;i++){
        		substr += charArray[i];
        		if(charArray[i] == 'L') {
                balance += 1;
            }else{
                balance -= 1;
            }
            
            if(balance == 0){
                output.add(substr.toString());
                substr = "".toString();
            }
        }
        return output;
    }

}
