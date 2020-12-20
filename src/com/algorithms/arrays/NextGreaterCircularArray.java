package com.algorithms.arrays;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterCircularArray {
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,1};
		//int[] nextGreaterElements = nextGreaterElements(nums);
		//System.out.println(nextGreaterElements);
		nextGreaterElementStack(nums);
	}
	
	public static int[] nextGreaterElements(int[] nums) {
		
		int res[] = new int[nums.length];
		
		for(int k=0; k<res.length;k++) {
			res[k] = -1;
		}
		
		for(int i=0; i<nums.length; i++) {
			
			int j = (i == nums.length-1) ? j=0 : i+1;			
			while(j != i) {				
				if(nums[j] > nums[i]) {
					res[i] = nums[j];
					break;
				}				
				if(j== nums.length-1) {
					j=0;
				}else {
					j++;
				}				
			}		
		}
		return res;
	}
	
	public static int[] nextGreaterElementStack(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];		
		Arrays.fill(res, -1);		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<2*n; i++) {
			
			while(!stack.isEmpty() && nums[stack.peek()] < nums[i%n]) {
				res[stack.pop()] = nums[i%n];
			}
			if(i<n) {
				stack.push(i);
			}
		}		
		return res;
	}

}
