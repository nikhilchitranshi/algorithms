package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumSubArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1967513926, 1540383426, -1967513926, -1540383426));
		
		System.out.println(maxset(list));
		
	}
	
	public static ArrayList<Integer> maxset(ArrayList<Integer> list) {
		
		long sum = 0, max=-1;
		int start=0, end=0, next_start=0, counter=0, max_counter=0, numNegatives=0;
		
		for(int i=0; i< list.size(); i++) {
			
			if(list.get(i) >= 0) {
				sum+=list.get(i);
				counter++;
				
				if(sum >max || (sum == max && counter > max_counter)) {
					start = next_start;
					end=i;
					max=sum;				
				}
				
			}else {
				
				sum = 0;
				next_start = i+1;
				numNegatives++;
				max_counter = counter;
				counter = 0;
				
			}		
		}
		
		if(list.size() == numNegatives) {
			return new ArrayList<Integer>();
		}
		
		return new ArrayList<Integer>(list.subList(start, end+1));
    }

}


