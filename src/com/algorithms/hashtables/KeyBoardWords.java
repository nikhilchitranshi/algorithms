package com.algorithms.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
//
//
//Example:
//
//Input: ['Hello', 'Alaska', 'Dad', 'Peace']
//Output: ['Alaska', 'Dad']

public class KeyBoardWords {
	
	public static void main(String[] args) {
		
		String words[] = new String[] {"Hello","Alaska","Dad","Peace"};
		for(String word : findWords(words)) {
			System.out.println(word);
		}
		
	}
	
public static String[] findWords(String[] words) {
        
        List<String> output = new ArrayList<String>();
        
        HashSet<Character> keyLine1 = stringToSet("qwertyuiop");
		HashSet<Character> keyLine2 = stringToSet("asdfghjkl");
		HashSet<Character> keyLine3 = stringToSet("zxcvbnm");
        
        for(String word : words){
            if(keyLine1.containsAll(stringToSet(word.toLowerCase()))
            		|| keyLine2.containsAll(stringToSet(word.toLowerCase()))
            		|| keyLine3.containsAll(stringToSet(word.toLowerCase()))) {
            		output.add(word);
            }
            
        }
        
        String outputArr[] = new String[output.size()];
        outputArr = output.toArray(outputArr);
        return outputArr;
    }

	public static HashSet<Character> stringToSet(String word){
		HashSet<Character> out = new HashSet<Character>();
		
		for(Character ch : word.toCharArray()) {
			out.add(ch);
		}
		return out;
	}

}
