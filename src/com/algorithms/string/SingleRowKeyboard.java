package com.algorithms.string;

public class SingleRowKeyboard {
	
//	There is a special keyboard with all keys in a single row.
//
//	You have given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25), initially your finger is at index 0. To type a character, you have to move your finger to the index of the desired character. The time taken to move your finger from index i to index j is |i – j|.
//
//	You want to type a string word. Write a program to calculate how much time it takes to type it with one finger.
	
	
	public static void main(String[] args) {
		//getTime("hello","pqrstuvwxyzabcdefghijklmno");
		getTime("cba", "abcdefghijklmnopqrstuvwxyz");
	}
	
	public static int getTime(String word, String keyboard) {
		int time = 0;
		char keyboardArray[] = keyboard.toCharArray();
		int lengthArray[] = new int[26];
		
		for(int i=0; i<keyboardArray.length; i++) {
			lengthArray[keyboardArray[i]-'a'] = i; 
		}
		
		char charArray[] = word.toLowerCase().toCharArray();
		
		time = lengthArray[charArray[0]-'a'];
		for(int i=0; i< charArray.length-1; i++ ) {
			time += Math.abs(lengthArray[charArray[i+1]-'a'] - lengthArray[charArray[i]-'a']);
		}
		
		System.out.println(time);
		return time;
	}

}
