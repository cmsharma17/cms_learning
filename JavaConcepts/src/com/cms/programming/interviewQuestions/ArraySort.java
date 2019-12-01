package com.cms.programming.interviewQuestions;

import java.util.Arrays;

public class ArraySort {
	public static void main(String args[]) {
		int arr[] = {23,45,67,89,12,34};
		printArray(arr);
		Arrays.sort(arr);
		printArray(arr);
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("/n");
	}
}
