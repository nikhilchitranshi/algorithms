package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SpecialMaxProduct {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,6,-1,8,-1,4,7,-1,2,7,6));
		maxSpecialProduct(new int[] {3,6,8,9,2,4});
	}
	
	
	public static int maxSpecialProduct(int[]  A) {
		
		int mod=1000000007;
		
		int[] ls=new int[A.length];
        int[] rs=new int[A.length];
        
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int i=1;
        while(i<A.length){
            if(!stack.empty() && A[i]>=A[stack.peek()]) 
            		stack.pop();
            else {
                int lsv=0;
                if(!stack.empty()) lsv=stack.peek();
                ls[i]=lsv;
                stack.push(i);
                i++;
            }
        }
        stack.clear();
        stack.push(A.length-1);
        i=A.length-2;
        while(i>=0){
            if(!stack.empty() && A[i]>=A[stack.peek()]) stack.pop();
            else {
                int rsv=0;
                if(!stack.empty()) rsv=stack.peek();
                rs[i]=rsv;
                stack.push(i);
                i--;
            }
        }
        
        long max=0;
        for(int j=1; j<A.length-1; j++)
            max=Math.max(1L*ls[j]*rs[j], max);
        return (int)(max%mod);
		
		
		
	}

}
