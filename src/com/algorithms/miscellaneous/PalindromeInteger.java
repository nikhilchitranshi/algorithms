package com.algorithms.miscellaneous;

public class PalindromeInteger {
	
	public static void main(String[] args) {
		System.out.println(new PalindromeInteger().isPalindrome(121));
	}
	
	public boolean isPalindrome(int x) {
		int orig = x;
		if (x < 0)
			return false;

		int reverseNum = 0;

		while (x != 0) {
			int rem = x % 10;
			x = x / 10;

			reverseNum = 10 * reverseNum + rem;
		}
		return x == reverseNum;
	}
	
	public boolean isPalindrome1(int x) {
        
        int num = x;
        
        if(num < 0 || (num % 10 ==0 && num != 0)){
            return false;
        }

        int y =0;
       
        while(num!=0){
            int rem = num % 10;
            num = num / 10;
            y = y*10 + rem;
        }
        return x == y;
    }

}
