package com.algorithms.arrays;

import java.util.ArrayList;

public class IncrementArrayNumber {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();		
		
		list.add(0);
		list.add(0);
		list.add(9);
		list.add(9);
		list.add(9);
		System.out.println(plusOne(list));
		
	}
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		
		int index = A.size()-1;
		
		while(index >= 0 && (A.get(index) + 1) >9) {
			A.set(index, 0);
			index--;
		}
		
		if(index==-1){
			A.add(0,1);
		}else {
			A.set(index, A.get(index)+1);
		}
		
		for(int i=0; i < A.size(); ) {
			if(A.get(i) == 0) {
				A.remove(i);
			}else {
				break;
			}
		}
		
		return A;
	}
	
	
}
