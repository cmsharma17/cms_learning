package com.cms.programming.interviewQuestions;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("Enter the Array elements-");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the location in which need to insert new element:");
		int loc = sc.nextInt();
		
		System.out.println("Enter the value:");
		int val = sc.nextInt();
		
		for(int i=arr.length-1; i>loc ; i--) {
			arr[i] = arr[i-1];
		}
		arr[loc] = val;
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
