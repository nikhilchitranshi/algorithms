package com.algorithms.string;

public class ToLowerCase {
	
	public String toLowerCase(String str) {
        char []charArray = str.toCharArray();
        
        for(int i=0; i<charArray.length; i++){
            int chInt = (int)charArray[i];
            if( chInt>= 65 && chInt <=90){
               charArray[i] = (char)(chInt+32); 
            }
        }        
        return String. valueOf(charArray);
    }

}
