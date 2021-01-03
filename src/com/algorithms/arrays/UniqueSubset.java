package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueSubset {
	
	public static void main(String[] args) {
		List<List<Integer>> subset = new UniqueSubset().subsets(new int[] {1,2,2});
		System.out.println(subset);
	}
	
	public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        powerSet(nums,0,new ArrayList<Integer>(),result);
        return new ArrayList<>(result);
    }
    
    static void powerSet(int nums[], int index, List<Integer> output, Set<List<Integer>> result ){
        
        if(index == nums.length){
            result.add(output);
            return;
        }
        
        List<Integer> oldOutput = new ArrayList<Integer>(output);
        output.add(nums[index]);
        
        powerSet(nums, index + 1, output, result);
        powerSet(nums, index + 1, oldOutput, result);
        return;
        
    }

}
