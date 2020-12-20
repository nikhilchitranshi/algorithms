package com.algorithms.hashtables;

public class IslandPerimeter {
	
	public static void main(String[] args) {
		int [][]grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		
		System.out.println(islandPerimeter(grid));
	}

	public static int islandPerimeter(int[][] grid) {

		int perimeter = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == 1) {
					// check for water on all sides

					// top
					if ((i-1 >=0 && grid[i - 1][j] == 0) || (i - 1) < 0)
						perimeter += 1;

					// bottom
					if ((i<grid.length-1 && grid[i + 1][j] == 0) || i == grid.length - 1)
						perimeter += 1;

					// left
					if ( ((j - 1) >=0 && grid[i][j - 1] == 0) || (j - 1) < 0) {
						perimeter += 1;
					}

					// right
					if ((j<grid[i].length-1 && grid[i][j+1] == 0) || j == grid[i].length - 1) {
						perimeter += 1;
					}
				}
			}
		}
		return perimeter;
	}

}
