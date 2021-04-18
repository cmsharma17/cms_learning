package com.cms.programming.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindTheLargestPossibleSum {

	public static void main(String[] args) {
		int arr[] = {5, 6, 3, 4, 2};
		solution(arr, 5);
	}
	
	public static int solution(int[] arr, int K) {
		int N = arr.length;
		if (K > N) 
    {
        return -1;
    }
 
    // Stores maximum even
    // subsequence sum
    int maxSum = 0;
 
    // Stores Even numbers
    ArrayList<Integer> Even = new ArrayList<Integer>();
 
    // Stores Odd numbers
    ArrayList<Integer> Odd = new ArrayList<Integer>();
 
    // Traverse the array
    for(int i = 0; i < N; i++)
    {
         
        // If current element
        // is an odd number
        if (arr[i] % 2 == 1)
        {
             
            // Insert odd number
            Odd.add(arr[i]);
        }
        else
        {
             
            // Insert even numbers
            Even.add(arr[i]);
        }
    }
 
    // Sort Odd[] array
    Collections.sort(Odd);
 
    // Sort Even[] array
    Collections.sort(Even);
 
    // Stores current index
    // Of Even[] array
    int i = Even.size() - 1;
 
    // Stores current index
    // Of Odd[] array
    int j = Odd.size() - 1;
 
    while (K > 0) 
    {
         
        // If K is odd
        if (K % 2 == 1)
        {
             
            // If count of elements
            // in Even[] >= 1
            if (i >= 0)
            {
                 
                // Update maxSum
                maxSum += Even.get(i);
 
                // Update i
                i--;
            }
 
            // If count of elements
            // in Even[] array is 0.
            else
            {
                return -1;
            }
 
            // Update K
            K--;
        }
 
        // If count of elements
        // in Even[] and odd[] >= 2
        else if (i >= 1 && j >= 1) 
        {
            if (Even.get(i) + Even.get(i - 1) <= 
                 Odd.get(j) + Odd.get(j - 1)) 
            {
                 
                // Update maxSum
                maxSum += Odd.get(j) + 
                          Odd.get(j - 1);
 
                // Update j
                j -= 2;
            }
            else
            {
                 
                // Update maxSum
                maxSum += Even.get(i) + 
                          Even.get(i - 1);
 
                // Update i
                i -= 2;
            }
 
            // Update K
            K -= 2;
        }
 
        // If count of elements
        // in Even[] array >= 2.
        else if (i >= 1) 
        {
             
            // Update maxSum
            maxSum += Even.get(i) + 
                      Even.get(i - 1);
 
            // Update i
            i -= 2;
 
            // Update K
            K -= 2;
        }
 
        // If count of elements
        // in Odd[] array >= 2
        else if (j >= 2) 
        {
             
            // Update maxSum
            maxSum += Odd.get(j) + 
                      Odd.get(j - 1);
 
            // Update i.
            j -= 2;
 
            // Update K.
            K -= 2;
        }
    }
   
    return maxSum;
    
	}

}
