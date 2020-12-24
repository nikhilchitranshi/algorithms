package com.algorithms.dynamicprogramming;

import java.util.HashMap;

public class Fibonacci {

	static HashMap<Long, Long> fibMap = new HashMap<Long, Long>();

	public static void main(String[] args) {
		System.out.println(fib(50L));
	}

	public static Long fib(Long n) {
		if (fibMap.containsKey(n)) {
			return fibMap.get(n);
		} else if (n <= 2) {
			return 1L;
		} else {
			fibMap.put(n, fib(n - 1) + fib(n - 2));
			return fibMap.get(n);

		}

	}

}
