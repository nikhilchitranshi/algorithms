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
        int result =0;
        HashMap<Character, Integer> charsMap = getMap(chars);
        
        for(String word : words){
           
            HashMap<Character, Integer> wordMap = getMap(word);
            
            int count = 0;
            
            for(char ch : word.toCharArray()){
                if( charsMap.containsKey(ch)  && (wordMap.get(ch) <= charsMap.get(ch))) 
                    count++;
            }
            
            if(count == word.length())
                result += count;
        }
        
        return result;        
    }

	
	public static HashMap<Character, Integer> getMap(String input){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char ch : input.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        return map;
        
    }

}
