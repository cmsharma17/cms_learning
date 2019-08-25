package com.cms.collectionFramework;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionReverseOrder {
	public static void main(String args[]){
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(-28);  
		list.add(20);  
	    list.add(-12);  
    	list.add(8);
    	
    	Comparator<Integer> cmp = Collections.reverseOrder();
    	Collections.sort(list,cmp);
    	//Collections.sort(list);
    	System.out.println("List sorted in ReverseOrder: ");      
    	for(Integer i : list){
    		System.out.print(i +" ");
    	}
	}
}
