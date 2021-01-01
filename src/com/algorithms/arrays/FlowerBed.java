package com.algorithms.arrays;

public class FlowerBed {

	public static void main(String[] args) {
		System.out.println(new FlowerBed().canPlaceFlowers(new int[] { 1}, 0));
	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {

		int count = 0;

		if (flowerbed.length == 0) {
			return false;
		}
		
		
		if (flowerbed.length == 1) {
			if(flowerbed[0] == 0)
				count++;

		} else {
			if (flowerbed[0] == 0 && flowerbed[1] == 0) {
				flowerbed[0]  =1;
				count++;
			}
			
			for (int i = 1; i < flowerbed.length - 1;) {
				if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
					count++;
					flowerbed[i] = 1;
					i = i + 2;
				} else {
					i++;
				}
			}

			if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
				flowerbed[flowerbed.length - 1] = 1;
				count++;
			}
		}

		

		return count >= n;

	}

}
