package com.algorithms.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class NonSortedArrayIntersection {

	public int[] intersection(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {
			Arrays.sort(nums2);
			return findIntersection(nums2, nums1);
		} else {
			Arrays.sort(nums1);
			return findIntersection(nums1, nums2);
		}

	}

	public int[] findIntersection(int sortedArray[], int biggerArray[]) {
		HashSet<Integer> output = new HashSet<Integer>();
		for (int i : biggerArray) {
			if (Arrays.binarySearch(sortedArray, i) >= 0) {
				output.add(i);
			}
		}
		return output.stream().mapToInt(e -> e.intValue()).toArray();

	}

}
