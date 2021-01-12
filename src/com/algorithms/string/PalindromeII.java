package com.algorithms.string;

/*
Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
*/
public class PalindromeII {

	public static void main(String[] args) {
		System.out.println(new PalindromeII().validPalindrome("abcde"));

	}

	public boolean validPalindrome(String s) {
		int low = 0, high = s.length() - 1;

		while (low < high) {
			if (s.charAt(low) == s.charAt(high)) {
				low++;
				high--;
			} else {
				if (isPalindrome(s.substring(low + 1, high + 1)))
					return true;

				if (isPalindrome(s.substring(low, high)))
					return true;
				
				return false;
			}
		}

		return true;
	}

	public boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;

		while (i <= j) {
			char left = s.charAt(i);
			char right = s.charAt(j);

			if (left != right) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

}
