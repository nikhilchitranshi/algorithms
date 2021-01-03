package com.algorithms.string;

import java.util.HashMap;

/*
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2. 
*/

public class FirstUniqueCharacterString {

	public int firstUniqChar(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}

}
