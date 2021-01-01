package com.algorithms.arrays;

public class OddValueMatrix {

	public static void main(String[] args) {
		System.out.println(new OddValueMatrix().oddCells(2,3,new int[][] {{0,1},{1,1}}));
	}

	public int oddCells(int n, int m, int[][] indices) {
        int []rows = new int[n];
        int []cols = new int[m];
        
        
        for (int i = 0; i < indices.length; i++) {
			int[] rowColArr = indices[i];
			int row = rowColArr[0];
			int col = rowColArr[1];

			rows[row]++;
            cols[col]++;
		}

		int odd = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((rows[i] + cols[j]) % 2 == 1) {
					odd++;
				}
			}
		}
		return odd;
    }

}
