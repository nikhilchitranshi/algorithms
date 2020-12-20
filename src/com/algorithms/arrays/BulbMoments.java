package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class BulbMoments {
	
	public static void main(String[] args) {
		
		int moments[] = {2,3,4,1,5};
		int occasions = 0;
		
		List<Integer> turnedOnBulbs = new ArrayList<Integer>();		
		
		for(int i = 0; i<moments.length; i++) {
			
			boolean willShine = isPredecessorPresent(moments[i], turnedOnBulbs);
			turnedOnBulbs.add(moments[i]);
			
			if(willShine) {
				occasions++;
			}			
		}		
		System.out.println(occasions);		
	}

	private static boolean isPredecessorPresent(int bulbNo, List<Integer> turnedOnBulbs) {
		
		if(bulbNo == 1) {
			return true;
		}
		
		if(turnedOnBulbs.size() == 0 ) {
			return false;
		}
		
		for(int i=bulbNo-1 ; i>=1; i--) {
			if(!turnedOnBulbs.contains(i))
				return false;
		}
		
		return true;
	}

}
