package com.algorithms.arrays;

public class FindMinimum {

	public static void main(String[] args) {
		int nums[] = new int[] { 3, 4, 5, 1, 2 };
		System.out.println(findMin(nums));
	}

	public static int findMin(int[] nums) {

		int left = 0, right = nums.length - 1;

		// No element
		if (nums.length == 0) {
			return -1;
		}
		// no rotation || Single element
		if (nums[right] > nums[0] || nums.length == 1) {
			return nums[0];
		}

		while (right >= left) {
			int mid = (left + right) / 2;

			if (nums[mid] > nums[mid + 1]) {
				return nums[mid + 1];
			}
			if (nums[mid] < nums[mid - 1]) {
				return nums[mid];
			}
			if (nums[mid] > nums[0]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
}
