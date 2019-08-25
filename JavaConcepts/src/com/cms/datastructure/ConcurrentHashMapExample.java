/*ConcurrentHashMap is the class that is similar to HashMap but works fine when you try to modify your map 
 * at runtime.
 *ConcurrentHashMap takes care of any new entry in the map whereas HashMap throws 
 *ConcurrentModificationException.
 * 
 *  */

package com.cms.datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		Map<String, String> chm = new ConcurrentHashMap<>();
		chm.put("1", "1");
		chm.put("2", "2");
		chm.put("3", "3");
		chm.put("4", "4");
		chm.put("5", "5");
		System.out.println("Concurrent Hashmap before iteration::"+chm);
		
		Iterator<String> itr = chm.keySet().iterator();
		while(itr.hasNext()){
			String key = itr.next();
			if(key.equals("3"))
				chm.put(key+"new", "new 3");
		}
		
		System.out.println("Concurrent Hashmap after iteration::"+chm);
		
		Map<String, String> hm = new HashMap<>();
		hm.put("1", "1");
		hm.put("2", "2");
		hm.put("3", "3");
		hm.put("4", "4");
		hm.put("5", "5");
		System.out.println("Hashmap before iteration::"+hm);
		
		Iterator<String> itr1 = hm.keySet().iterator();
		while(itr1.hasNext()){
			String key = itr1.next();
			if(key.equals("3"))
				hm.put(key+"new", "new 3");
				//hm.remove(key);
		}
		
		System.out.println("Concurrent Hashmap after iteration::"+hm);

	}

}
