package com.algorithms.arrays;

public class SortedSquareArray {

	public static void main(String[] args) {
		int[] num = new int[] { -1 };
		
		sortedSquares(num);
	}

	public static int[] sortedSquares(int[] num) {

		int i = 0, k = 0,n=num.length;
		int[] res = new int[n];
		while (i<n && num[i] < 0)  {
			i++;
		}

		int j = i - 1;

		while (i < n && j >= 0) {

			int sq1 = num[i] * num[i];
			int sq2 = num[j] * num[j];

			if (sq1 < sq2) {
				res[k++] = sq1;
				i++;
			} else {
				res[k++] = sq2;
				j--;
			}
		}
		
		while(j>=0) {
            res[k++] = num[j] * num[j];
            j--;
        }
		while(i < n) {
            res[k++] = num[i]*num[i];
            i++;
        }
		
		return res;
	}

}
