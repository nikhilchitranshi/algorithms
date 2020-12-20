package com.algorithms.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
//
//You may return the answer in any order.
//
// 
//
//Example 1:
//
//Input: ["bella","label","roller"]
//Output: ["e","l","l"]
//Example 2:
//
//Input: ["cool","lock","cook"]
//Output: ["c","o"]

public class FindCommonCharacters {
	
	public static void main(String[] args) {
		
		String words[] = {"bella","lablel","roller"};
//		new FindCommonCharacters().commonChars(words);
		
		getMap("bella");
	}
	
	
	public List<String> commonChars(String[] A) {
		List<String> output = new ArrayList<>();
        
		int minFrequencies[] = new int[26];
		Arrays.fill(minFrequencies, Integer.MAX_VALUE);
		
		for(String s : A) {
			int char_frequencies[] = new int[26];
			
			for(char ch : s.toCharArray()) {
				char_frequencies[ch - 'a']++;
			}
			
			for(int i=0; i<minFrequencies.length; i++) {
				minFrequencies[i] = Math.min(minFrequencies[i], char_frequencies[i]);
			}
			
		}
		
		for(int i=0; i<minFrequencies.length; i++) {
			if(minFrequencies[i] == 0) continue;
			for(int j=0; j<minFrequencies[i]; j++) {
				output.add(((char)(i+'a'))+"");
			}
		}
		return output;
    }

}
