package com.cms.programming.interviewQuestions;

public class FindSibLing {

	public static void main(String[] args) {
		int num = 38293367; 
        System.out.println(printMaxNum(num)); 

	}
	static int printMaxNum(int num) 
    { 
	// hashed array to store count of digits 
    int count[] = new int[10]; 
      
    // Converting given number to string 
    String str = Integer.toString(num); 
      
    // Updating the count array 
    for(int i=0; i < str.length(); i++) 
        count[str.charAt(i)-'0']++; 
      
    // result is to store the final number 
    int result = 0, multiplier = 1; 
    for (int i = 0; i <= 9; i++) 
    { 
        while (count[i] > 0) 
        { 
            result = result + (i * multiplier); 
            count[i]--; 
            multiplier = multiplier * 10; 
        } 
    } 
   
    // return the result 
    return result;
    // Traversing the count array 
    // to calculate the maximum number 
    }

}
