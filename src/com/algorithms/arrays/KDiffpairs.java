package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KDiffpairs {

	public static void main(String[] args) {
		int[] nums = new int[] {1,3,4,1,5};
		System.out.println(findDiffPairsCount(nums, 2));
		//System.out.println(findPairs(nums, 1));
		System.out.println(findPairsMap(nums, 2));
	}

	public static int findDiffPairsCount(int[] nums, int k) {

		Set<Pair> uniqueItems = new HashSet<>();
		List<Integer> numbers = new ArrayList<Integer>();

		if (k < 0)
			return 0;

		for (int i = 0; i < nums.length; i++) {

			int limit1 = nums[i] - k, limit2 = nums[i] + k;

			if (numbers.contains(limit1)) {

				if (nums[i] > limit1) {
					uniqueItems.add(new Pair(nums[i], limit1));
				} else {
					uniqueItems.add(new Pair(limit1, nums[i]));
				}
			}

			if (numbers.contains(limit2)) {

				if (nums[i] > limit2) {
					uniqueItems.add(new Pair(nums[i], limit2));
				} else {
					uniqueItems.add(new Pair(limit2, nums[i]));
				}
			}
			numbers.add(nums[i]);
		}
		// System.out.println(uniqueItems);
		return uniqueItems.size();
	}
	
	public static int findPairs(int[] nums, int k) {
		if(k<0) return 0;
		
		int count = 0;
		int prev = Integer.MIN_VALUE;
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == prev) continue;
			
			int complement = nums[i] + k;
			
			if(Arrays.binarySearch(Arrays.copyOfRange(nums, i+1, nums.length), complement) >=0)
				count++;		
			
			prev = nums[i];
		}		
		return count;
	}
	
	
	public static int findPairsMap(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }

}

//https://jira.ihsmarkit.com/browse/MRD-6042

class Pair {
	int i;
	int j;

	public Pair(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		return true;
	}

}
