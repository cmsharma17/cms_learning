/*Merge two array lists to one without using inbuilt functions, map and set, */

package com.cms.interviewQues;

public class MergeTwoArrays {
	public static void main(String args[]){
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,1,2};
		
		int c[] = new int[a.length + b.length];
		int count = 0;
		
		for(int n : a){
			c[count] = n;
			count ++;
		}
		
		for(int n : b){
			c[count] = n;
			count ++;
		}
		
		for(int i =0; i<c.length; i++)
			System.out.print(c[i] + " ");
	}
}
