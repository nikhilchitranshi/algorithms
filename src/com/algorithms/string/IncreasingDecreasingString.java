package com.algorithms.string;

public class IncreasingDecreasingString {

	public static void main(String[] args) {
		System.out.println(sortString("rat"));
	}

	public static String sortString(String s) {

		int length = s.length();
		int[] freq = new int[26];

		for (int i = 0; i < length; i++) {
			freq[s.charAt(i) - 'a'] += 1;
		}

		int index = 0;
		char[] resArr = new char[length];

		while (index < length) {
			for (int i = 0; i < 26; i++) {
				if (freq[i] > 0) {
					resArr[index++] = (char) (i + 'a');
					freq[i]--;
				}
			}
			for (int i = 25; i >= 0; i--) {
				if (freq[i] > 0) {
					resArr[index++] = (char) (i + 'a');
					freq[i]--;
				}
			}
		}
		return new String(resArr);
	}
}
