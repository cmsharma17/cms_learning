/*Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum 
 * is equal to ‘sum’
 * Input  :  arr[] = {1, 5, 7, -1}, 
          sum = 6
Output :  2
Pairs with sum 6 are (1, 5) and (7, -1).
 * */

package com.cms.interviewQues;

import java.util.HashMap;
import java.util.Map;

public class FindCountOfPairsWithGivenSum {
	public static void main(String args[]) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int sum = 6;
		FindCountOfPairsWithGivenSum obj = new FindCountOfPairsWithGivenSum();
		obj.getPairs(arr, sum);
	}

	private void getPairs(int[] arr, int sum) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (Integer i : arr) {
			if (!hm.containsKey(i)) {
				hm.put(i, 1);
			} else {
				hm.put(i, hm.get(i) + 1);
			}
		}
		
		int twice_count = 0;
		for(int i=0; i<(arr.length ); i++) {
			if(hm.get(sum - arr[i]) != null) {
				System.out.println(hm.get(sum-arr[i]));
				twice_count += hm.get(sum-arr[i]); 
			}
			if (sum - arr[i] == arr[i]) {
				twice_count--;
			}

		}
		System.out.println("Pair-->"+twice_count/2);
		printArray(hm);
	}

	private void printArray(HashMap<Integer, Integer> hm) {
		hm.forEach((k,v) -> System.out.println("Key-"+k+",Value-"+v));
	}
	
}
