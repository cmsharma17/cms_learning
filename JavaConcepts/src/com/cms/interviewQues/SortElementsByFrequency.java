/*
 * Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the 
 * one which came first.
 * Examples :
 * 
 *  Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}

 * */
package com.cms.interviewQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortElementsByFrequency {
	
	private void sortByFrequency(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		List<Integer> outputArray = new ArrayList<>();
		for(int current : arr) {
			System.out.print(" "+ current + " ");
			
			int count = hm.getOrDefault(current, 0); 
            hm.put(current, count + 1);
            outputArray.add(current);
		}
		
		SortComparator comp = new SortComparator(hm);
		Collections.sort(outputArray, comp);
		
		for(Map.Entry mapEntry : hm.entrySet()) {
			System.out.println("\nKey->"+mapEntry.getKey()+",Frequency->"+mapEntry.getValue());
		}
		
		// Final Output 
        for (Integer i : outputArray) { 
            System.out.print(i + " "); 
        } 
	}
	
	//Driver method
	public static void main(String args[]) {
		int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
		SortElementsByFrequency obj = new SortElementsByFrequency();
		obj.sortByFrequency(arr);
	}	
}

//Implement Comparator Interface to sort the values 
class SortComparator implements Comparator<Integer>{
	
	private HashMap<Integer, Integer> freqMap = new HashMap<>();
	
	SortComparator(HashMap<Integer, Integer> tFreqMap){
		this.freqMap = tFreqMap;
	}
	
	// Compare the values 
    @Override
    public int compare(Integer k1, Integer k2) 
    { 
		//Compare value by Frequency
    	int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));
    	
    	// Compare value if frequency is equal 
    	int valueCompare = k1.compareTo(k2);
    	
    	// If frequency is equal, then just compare by value, otherwise - 
        // compare by the frequency. 
    	if(freqCompare == 0) 
    		return valueCompare;
    	else
    		return freqCompare;	
	}
}