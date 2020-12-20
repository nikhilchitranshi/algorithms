package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixMinimumSteps {
	
	public static void main(String[] args) {
		
		List<Integer> A = Arrays.asList(4,1,4,10);
		List<Integer> B = Arrays.asList(6,2,5,12);
		
		System.out.println("No of steps : "+ new MatrixMinimumSteps().coverPoints(A, B));
		
	}

	public int coverPoints(List<Integer> A, List<Integer> B) {

		int noOfSteps = 0;

		for (int i = 0; i < A.size() - 1; i++) {

			Point p1 = new Point(A.get(i), B.get(i));
			Point p2 = new Point(A.get(i+1), B.get(i+1));

			noOfSteps += shortestPath(p1, p2);
		}
		return noOfSteps;
	}

	public int shortestPath(Point p1, Point p2) {

		return Math.max(Math.abs(p2.x - p1.x), Math.abs(p2.y - p1.y));

	}
}

class Point {

	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
