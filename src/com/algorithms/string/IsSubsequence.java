package com.algorithms.string;

/*
 * 
 */

public class IsSubsequence {
	
	public static void main(String[] args) {
		System.out.println(new IsSubsequence().isSubsequenceRecursive("aec", "abcde", 3, 5));
	}

	public boolean isSubsequence(String s, String t) {

		int index = 0;

		char[] tarray = t.toCharArray();
		char[] sarray = s.toCharArray();

		if ((s.length() == 0 && t.length() == 0) || s.length() == 0) {
			return true;
		}

		if (t.length() == 0)
			return false;

		for (int i = 0; i < tarray.length && index < sarray.length; i++) {
			if (tarray[i] == sarray[index]) {
				index++;
			}
		}

		if (sarray.length == index) {
			return true;
		}

		return false;

	}
	
	boolean isSubsequenceRecursive(String s, String t, int m, int n) {
		
		if(m == 0) {
			return true;
		}
		
		if(n == 0 ) {
			return false;
		}
		
		if(s.charAt(m-1) == t.charAt(n-1)) {
			return isSubsequenceRecursive(s, t, m-1, n-1);
		}
		
		return isSubsequenceRecursive(s, t, m, n-1);
	}
	
	
	
	
}
