package com.algorithms.arrays;

public class JavaLoops {
	
	public static void main(String[] args) {
		
		
		
		//a=0, b=2, n=10
		int n = 10, b=2, a=0;
		for(int i=0; i< n; i++) {
			int term = a;
			
			for(int j=0; j<=i; j++) {
				term += (b * Math.pow(2, j));
			}
			System.out.print(term +", ");
		}
		
	}
	
	

}
