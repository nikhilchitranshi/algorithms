package com.algorithms.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FreqOrderString {
	
public String frequencySort(String s) {
        
        String output = "";
        
        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        
        for(Character ch : s.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
        }
        
        List<Map.Entry<Character, Integer>> entries = new LinkedList<Map.Entry<Character, Integer>>(freqMap.entrySet());
        
        Collections.sort(entries, new Comparator<Map.Entry<Character, Integer>>(){
            public int compare(Map.Entry<Character, Integer> obj1, Map.Entry<Character, Integer> obj2){
                return (obj2.getValue()).compareTo(obj1.getValue());
            }
        });
        
        for(Map.Entry<Character, Integer> entry : entries){
            for(int i=0; i<entry.getValue();i++){
                output += entry.getKey();
            }
        }
        return output;
    }

}
