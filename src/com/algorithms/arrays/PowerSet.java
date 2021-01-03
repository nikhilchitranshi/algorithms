package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
	
	static Set<List<Integer>> result = new HashSet<List<Integer>>();

	static void powerSet(int[] nums, int index, ArrayList<Integer> output)

	{
		int n = nums.length;

		// base case
		if (index == n) {
			result.add(output);
			return;
		}

		// Two cases for every character
		// (i) We consider the character
		// as part of current subset
		// (ii) We do not consider current
		// character as part of current
		// subset
		ArrayList<Integer> oldOutput = new ArrayList<Integer>(output);
		output.add(nums[index]);
		powerSet(nums, index + 1, output  );
		powerSet(nums, index + 1, oldOutput);

	}

	// Driver code
	public static void main(String[] args) {
		int []str = new int[] {1,2,2};
		int index = 0;
		ArrayList<Integer> output =new ArrayList<Integer>();
		powerSet(str, index, output);
		System.out.println(result);

	}

}
