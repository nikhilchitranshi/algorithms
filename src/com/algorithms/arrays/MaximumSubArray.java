package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-11, -1, -1));
		
		System.out.println(maxSubArray(list));
		
	}
	
	public static int maxSubArray(final List<Integer> A) {
		
		int sum=0, max_sum=Integer.MIN_VALUE;
		
		for(int i=0; i<A.size(); i++) {
			
			sum += A.get(i);
			
			max_sum = Math.max(sum, max_sum);
			
			if(sum < 0) {
				sum = 0;
			}
			
		}		
		return max_sum;
    }

}
