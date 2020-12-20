package com.algorithms.arrays;

public class TestThread {
	
	public static void main(String[] args) {
		
		
		Thread thread = new Thread(){
		    public void run(){
		      System.out.println("Thread Running");
		    }
		  };

		  thread.start();
	}

}
