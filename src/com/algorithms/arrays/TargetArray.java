package com.algorithms.arrays;

import java.util.Arrays;

public class TargetArray {
	
	public static void main(String[] args) {
		for(int i : createTargetArray(new int[] {0,1,2,3,4}, new int[] {0,1,2,2,1})) {
			System.out.println(i);
		}
	}
	
	
	public static int[] createTargetArray(int[] nums, int[] index) {
        int []output = new int[nums.length];
        Arrays.fill(output, -1);
        
        for(int i=0; i<nums.length; i++) {
            
            if(output[index[i]] == -1)  {
                output[index[i]] = nums[i];
            }else{
            		int j = index[i];
            		
            		while(output[j]!=-1) {
            			j++;
            		}
            		
            		while(j>index[i]) {
            			output[j] = output[j-1];
            			j--;
            		}
            		output[index[i]] = nums[i];
            	
            }
            
        }
        
        return output;
        
    }

}
