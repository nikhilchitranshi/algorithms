package com.algorithms.arrays;

/*
 Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
 */
public class MatrixDiagonalSum {

	public int diagonalSum(int[][] mat) {

		int n = mat.length;
		int diagonalSum = 0;

		for (int i = 0; i < n; i++) {
			diagonalSum += mat[i][i];
		}

		for (int j = n - 1, k = 0; j >= 0 && k < n; j--, k++) {
			diagonalSum += mat[k][j];
		}

		if (n % 2 == 1)
			diagonalSum -= mat[n / 2][n / 2];

		return diagonalSum;

	}

}
