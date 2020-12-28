package com.algorithms.string;

import java.util.HashSet;
import java.util.Set;

public class NSEW {
	
	public static void main(String[] args) {
		System.out.println(isPathCrossing("NES"));
	}

	public static boolean isPathCrossing(String path) {
		Set<Pair> pointsVisited = new HashSet<Pair>();
		int x = 0, y = 0;
		pointsVisited.add(new Pair(x,y));
		
		for (char ch : path.toCharArray()) {
			Pair newCoordinate = null;
			if(ch == 'N') {
				newCoordinate = new Pair(x,++y);				
			}else if(ch == 'S') {
				newCoordinate = new Pair(x,--y);	
			}else if(ch == 'E') {
				newCoordinate = new Pair(++x,y);	
			}else {
				newCoordinate = new Pair(--x,y);	
			}
			
			if(pointsVisited.contains(newCoordinate)) {
				return true;
			}
            
            pointsVisited.add(newCoordinate);
            
		}
		return false;

	}

}

class Pair{
    int x;
    int y;
    
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pair [x=" + x + ", y=" + y + "]";
	}
	
	
    
    
}
