package com.cms.interviewQues;

public class FindAllSubSet {
	
	public static void findAllSubSet(int[] inputArr) {
		int[] subSet = new int[inputArr.length];
		helper(inputArr, subSet, 0);
	}
	
	private static void helper(int[] inputArr, int[] subSet, int i) {
		if(i == inputArr.length) {
			System.out.println("\n");
			for(int j =0; j<subSet.length; j++) {
				if(subSet[j] != 0)
				 System.out.print(subSet[j]+" ");
			}
		}else {
			subSet[i] = 0;
			helper(inputArr, subSet, i+1);
			subSet[i]= inputArr[i];
			helper(inputArr, subSet, i+1);
		}
	}
	
	public static void main(String args[]) {
		int arr[]= {1,2,3};
		findAllSubSet(arr);
	}
	
}
