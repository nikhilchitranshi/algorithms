package com.algorithms.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FrequencySortedArray {
	
	public static void main(String[] args) {
		new FrequencySortedArray().frequencySort(new int[] {1,1,2,2,2,3});
	}

	public int[] frequencySort(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] sorted = new int[nums.length];

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> entries = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

		Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				int res = (o1.getValue()).compareTo(o2.getValue());
				if (res != 0)
					return res;
				else
					return (o1.getKey()).compareTo(o2.getKey());
			}
		});
		int k = 0;
		for (Map.Entry<Integer, Integer> entry : entries) {
			for (int i = 0; i < entry.getValue(); i++) {
				sorted[k++] = entry.getKey();
			}
		}
		return sorted;
	}

}
