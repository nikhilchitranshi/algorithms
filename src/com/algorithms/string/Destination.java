package com.algorithms.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Destination {
//	[["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
	
	public static void main(String[] args) {
		List<String> pair1 = new ArrayList<String>();
		pair1.add("London");
		pair1.add("New York");
		
		List<String> pair2 = new ArrayList<String>();
		pair2.add("New York");
		pair2.add("Lima");
		
		List<String> pair3 = new ArrayList<String>();
		pair3.add("Lima");
		pair3.add("Sao Paolo");
		
		List<List<String>> list = new ArrayList<>();
		list.add(pair1);
		list.add(pair2);
		list.add(pair3);
		
		System.out.println(destCity(list));
		
	}
	
	
	public static String destCity(List<List<String>> paths) {
        String destination = "";
        HashMap<String, String> combosMap = new HashMap<String, String> ();
        for(List<String> pair : paths){
        	combosMap.put(pair.get(0),pair.get(1));
        }
        
        Set<String> set = combosMap.keySet();
        for(String value : combosMap.values()){
            if(!set.contains(value)){
                destination = value;
                break;
            }
        }
        
        return destination;
    }

}
