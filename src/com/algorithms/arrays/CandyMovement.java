package com.algorithms.arrays;

import java.util.Scanner;

public class CandyMovement {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println(getMovements(n));
		
		
	}
	
	
	private static int getMovements(int n) {
		int sq = n;
		int mid = n/2 +1;
		int moves = n%2 == 0 ? 1 : 0;
		
		
		for(int i=mid+1; i<=n; i++) {
			moves += ((2*i-1) - sq);
		}				
		
		return moves;
	}

}
