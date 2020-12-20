package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NobleInteger {

	public static void main(String[] args) {
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(-1, -2, 0, 0, 0, -3))));
	}

	public static int solve(ArrayList<Integer> A) {

		Collections.sort(A);

		for(int i=0; i< A.size(); i++) {
			
			while(i<A.size() -1 && A.get(i) == A.get(i+1)) {
				i++;
			}
			
			if(A.get(i) == A.size()-i-1) {
				return 1;
			}
			
			
		}

		return -1;
	}

}
