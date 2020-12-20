package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 5, 2, 25));

		//findNextGreaterElement(list);
		
		findNextGreaterElementByIndex(list);
	}

	private static void findNextGreaterElementByIndex(ArrayList<Integer> list) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int[] rightSpecialValue = new int[list.size()];

		stack.push(0);
		
		for (int i = 1; i < list.size(); i++) {
			
			if(!stack.isEmpty()) {
				
				int elementIndex = stack.pop();
				
				while(list.get(i) > list.get(elementIndex)) {
					rightSpecialValue[elementIndex] = i;
					
					if (stack.isEmpty()) {
						break;
					}
					
					elementIndex = stack.pop();
				}
				
				if(list.get(i) < list.get(elementIndex)) {
					stack.push(elementIndex);
				}
				
				
			}
			
			stack.push(i);		
		}	
		
		System.out.println("Right special is : "+rightSpecialValue);
	}

	private static void findNextGreaterElement(ArrayList<Integer> list) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(list.get(0));

		int next = -1;

		for (int i = 1; i < list.size(); i++) {

			next = list.get(i);

			if (!stack.isEmpty()) {
				int element = stack.pop();

				while (next > element) {

					System.out.println("element ->" + element + " next -> " + next);

					if (stack.isEmpty()) {
						break;
					}

					element = stack.pop();

				}

				if (element > next) {
					stack.push(element);
				}
			}
			stack.push(next);
		}

		while (!stack.isEmpty()) {
			System.out.println("element ->" + stack.pop() + " next -> " + "-1");
		}
	}
	
	

}
