package com.algorithms.arrays;

/*
Given the array prices where prices[i] is the price of the ith item in a shop. There is a special discount for items in the shop, if you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i], otherwise, you will not receive any discount at all.

Return an array where the ith element is the final price you will pay for the ith item of the shop considering the special discount.

 

Example 1:

Input: prices = [8,4,6,2,3]
Output: [4,2,4,2,3]
Explanation: 
For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4. 
For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2. 
For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4. 
For items 3 and 4 you will not receive any discount at all.
*/
public class Prices {
	
	public static void main(String[] args) {
		//new Prices().finalPrices(new int[] {8,4,6,2,3});
		
		String []arr = "a good   example".trim().split(" ");
		System.out.println(arr);
		System.out.println("   ".length());
	}
	
	public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        int index = 0;
        
        for(int i=0; i<n-1; i++){
            int j=i+1;
            System.out.println(i);
            
            if(prices[j] <= prices[i]){
                result[index++] = prices[i]-prices[j];        
            }else{
                while(j<n && !(prices[j] <= prices[i])){
                    j++;
                }
                if(j == n) {
                	result[index++] = prices[i];  
                }else {
                		result[index++] = prices[i]-prices[j];  
                }
            }
        }
        result[n-1] = prices[n-1];
        return result;
    }

}
