package com.cms.basicConcepts;

public class MultiplicationOfTwoNumber {
	
	
	public static void main(String[] args) {
		int arr[] = new int[]{5,6,3,9,18,13};
		MultiplicationOfTwoNumber obj = new MultiplicationOfTwoNumber();
		obj.getMultiplication(arr);

	}
	
	public void getMultiplication(int arr[]){
		int max1 = 0;
		int max2 = 0;
		for(int n : arr){
			if(n > max1){
				max2 = max1;
				max1 = n;
			}else{
				max2 = n;
			}
		}
		
		System.out.println("Max1--"+max1+"--Max2--"+max2+"--Higsest Multiplication::"+ max1*max2);
	}

}
