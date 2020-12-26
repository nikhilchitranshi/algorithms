package com.algorithms.string;

import java.util.ArrayList;
import java.util.HashMap;

/*
We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words. 

You may return the list in any order.

 

Example 1:

Input: A = "this apple is sweet", B = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: A = "apple apple", B = "banana"
Output: ["banana"]
 */

public class UncommonCharacters {

	public String[] uncommonFromSentences(String A, String B) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();
		String allwords = A + " " + B;

		for (String s : allwords.split(" ")) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		for (String s : map.keySet()) {
			if (map.get(s) == 1)
				list.add(s);

		}

		String[] output = new String[list.size()];
		output = list.toArray(output);
		return output;
	}

}
