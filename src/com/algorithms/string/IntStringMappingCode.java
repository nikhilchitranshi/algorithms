package com.algorithms.string;

import java.util.HashMap;
import java.util.Set;

public class IntStringMappingCode {
	
	static String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

	public static void main(String[] args) {
		String pattern = "10#11#12";
		System.out.println(freqAlphabets(pattern));
		
		HashMap<String, String> combosMap = new HashMap<String, String> ();
		
		Set<String> keySet = combosMap.keySet();
		keySet.iterator().next();
	}

	public static String freqAlphabets(String s) {                
        StringBuffer result = new StringBuffer();
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i) == '#') {                
                result.insert(0, abc[((s.charAt(i-2)-48)*10 + (s.charAt(i-1)-48))-1]);
                i=i-2;
            } else {
                result.insert(0, abc[(s.charAt(i)-48)-1]);
            }
        }
        
        return result.toString();
    }

}
