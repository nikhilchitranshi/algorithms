package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        
        for(int i=1; i<arrayList.size(); i++) {
            
            if(i % 2 == 0) {    //Greater than both side
                
                if(arrayList.get(i) < arrayList.get(i-1))
                    swapElements(arrayList, i, i-1);
                
                if(i<arrayList.size()-1 && arrayList.get(i) < arrayList.get(i+1))
                    swapElements(arrayList, i, i+1);
            
            }else {   //Smaller than both side
                
                if(arrayList.get(i) > arrayList.get(i-1))
                    swapElements(arrayList, i, i-1);
                
                if(i<arrayList.size()-1 && arrayList.get(i) > arrayList.get(i+1))
                    swapElements(arrayList, i, i+1);
                
                
            }
            
            
        }
        
        
        
        
        return arrayList;
    }
    
    
    private static ArrayList<Integer> swapElements(ArrayList<Integer> arrayList, int i, int j){
        
        int temp = arrayList.get(i);
        arrayList.set(i, arrayList.get(j));
        arrayList.set(j, temp);
        
        return arrayList;
    }
}
