package com.algorithms.hashtables;

import java.util.HashMap;

//You are given an array of strings words and a string chars.
//
//A string is good if it can be formed by characters from chars (each character can only be used once).
//
//Return the sum of lengths of all good strings in words.
//
// 
//
//Example 1:
//
//Input: words = ["cat","bt","hat","tree"], chars = "atach"
//Output: 6
//Explanation: 
//The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
//Example 2:
//
//Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//Output: 10
//Explanation: 
//The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

public class FindWords {
	
	public static void main(String[] args) {
		String words[] = {"cat","bt","hat","tree"};
		String chars = "atach";
		
		int count = new FindWords().countCharacters(words, chars);
		System.out.println(count);
	}
	
	
	
	public int countCharacters(String[] words, String chars) {
        int sum = 0;
        for(String word : words){
            int[] w1 = charsToIntArray(word);
            int[] w2 = charsToIntArray(chars);
            boolean match = true;
            for(int i = 0; i<w1.length; i++){
                if(w1[i] > w2[i]){
                    match = false;
                    break;
                }
            }
            if(match){
                sum += word.length();
            }
        }
        return sum;
    }
    private int[] charsToIntArray(String chars){
        int[] result = new int[26];
        for(int i = 0; i<chars.length(); i++){
            result[chars.charAt(i) - 'a']++;
        }
        return result;
    }

}
