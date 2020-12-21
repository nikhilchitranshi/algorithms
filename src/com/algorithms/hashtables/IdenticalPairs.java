package com.algorithms.hashtables;

import java.util.HashMap;

public class IdenticalPairs {
	
	public static void main(String[] args) {
		int nums[] = {1,2,3,1,1,3};
		
		System.out.println(numIdenticalPairs(nums));
	}
	
	
	public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer, Integer> frequency = new HashMap<Integer,Integer>();
        
        for(Integer num : nums){
            frequency.put(num, frequency.getOrDefault(num,0)+1);
        }
        
        for(Integer i : frequency.values()){
            goodPairs += (i* (i-1))/2;
        }
        return goodPairs;
    }

}
