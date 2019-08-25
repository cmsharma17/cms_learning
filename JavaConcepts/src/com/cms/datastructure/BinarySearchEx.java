package com.cms.datastructure;

public class BinarySearchEx {
	public static boolean contains(int a[], int b){
		if(a.length==0)
			return false;
		int low = 0;
		int high = a.length-1;
		while(low<=high){
			int middle = (low+high)/2;
			if(b==a[middle])
				return true;
			if(b > a[middle])	//if b is greater than middle element
				low = middle+1;
			else
				high = middle -1;
		}
		return false;
		
	}
}
