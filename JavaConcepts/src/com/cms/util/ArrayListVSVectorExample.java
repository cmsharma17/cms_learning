package com.cms.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVSVectorExample {
	public static void main(String []args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> vector = new Vector<>();
		
		for(int i=1; i<10; i++) {
			arrayList.add(i);
			vector.add(i);
		}
		
		System.out.println("arrayList::"+arrayList);
		System.out.println("vector::"+vector);
	}
}
