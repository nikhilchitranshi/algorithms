package com.algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

public class PairSum {

	public static void main(String[] args) {

		Integer nums[] = {4,3,4,2,1,5};
		int target = 6;
		int[] twoSum = twoSum(nums, target);
		
		if(null != twoSum) {
			System.out.println("["+twoSum[0] +", "+twoSum[1]+"]");
		}
		

	}

	public static int[] twoSum(Integer[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");

	}
}