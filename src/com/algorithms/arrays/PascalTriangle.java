package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

/*
 Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */

public class PascalTriangle {
	
	public static void main(String[] args) {
		new PascalTriangle().generate(5);
	}

	public List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>();
		row.add(1);
		output.add(row);
		
		
		for(int i=1; i<numRows; i++) {			
			List<Integer> presentRow = new ArrayList<Integer>();
			List<Integer> prevRow = output.get(i-1);
			
			presentRow.add(1);
			for(int j=1;j<i;j++) {
				presentRow.add(prevRow.get(j-1)+prevRow.get(j));				
			}
			presentRow.add(1);
			output.add(presentRow);			
		}		
		return output;
	}
}
