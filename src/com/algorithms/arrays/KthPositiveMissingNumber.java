package com.algorithms.arrays;

import java.util.Arrays;

public class KthPositiveMissingNumber {

	public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int i = 1, j=0;
        while(count != k)
        {
            if(j<arr.length && arr[j] == i){
                j++;
                i++;
            }else{
                i++;
                count++;
            }
        }
        return i-1;
    }

}
