package com.cms.collectionFramework;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet();
		set.add("a");
		//set.add(null); //Set not permit to insert null
		set.add("d");
		set.add("c");
		set.add("c");//Insertion of duplicate elements are not allowed in Set, but not showing any error. 
		
		System.out.println("Size of the set::"+set.size());
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
