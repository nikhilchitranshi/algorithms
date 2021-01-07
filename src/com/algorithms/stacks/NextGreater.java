package com.algorithms.stacks;

import java.util.HashMap;
import java.util.Stack;

public class NextGreater {
	
	public static void main(String[] args) {
		new NextGreater().nextGreaterElement(new int[] {4,1,2}, new int[]{1,3,4,2});
	}
	
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result[] = new int[nums1.length];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(nums2[0]);
        map.put(nums2[0], -1);
        
        for(int i=1; i<nums2.length; i++){
            
            Integer num = nums2[i];
            Integer nextSmaller = null;
            
            while(true){
                
                if(!stack.empty() && stack.peek() < num)
                    nextSmaller = stack.pop();
                else
                    break;
            }
            
            if(null != nextSmaller){
                map.put(nextSmaller, num);
            }
            
            stack.push(num);
        }
        
        for(int i=0;i<nums1.length; i++){
            result[i] = map.get(nums1[i]) == null ? -1 : map.get(nums1[i]);
        }
        return result;
    }

}
