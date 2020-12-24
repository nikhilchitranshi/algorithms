package com.algorithms.arrays;

/*
 * We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 */

public class Decompress {
	
	public static void main(String[] args) {
		for(int i : decompressRLElist(new int[] {1,2,3,4})) {
			System.out.println(i);
		}
	}
	
	
	
	public static int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i=i+2)
            size=size+nums[i];
        
        int []output = new int[size];
        
        for(int i=0; i<nums.length-1;i=i+2){
            int freq = nums[i];
            int val = nums[i+1];
            int l=0;
            for(int j=0; j<freq; j++){
                output[l++] = val;
            }
            
        }
        
        return output;
        
    }

}
