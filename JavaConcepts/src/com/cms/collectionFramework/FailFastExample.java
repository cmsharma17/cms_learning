package com.cms.collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastExample {

	public static void main(String[] args) {
		//Hashtable<String, String> map = new Hashtable<>();
		HashMap<String, String> map = new HashMap<>();
		//ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("1", "Chandra");
		map.put("2", "Vartika");
		
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//map.put("3", "Shekhar");
			//map.remove("2");
			itr.remove();
		}

	}

}
