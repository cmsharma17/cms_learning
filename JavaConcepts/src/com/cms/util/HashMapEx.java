package com.cms.util;

/*Write a HshMap java program that take key as 'a' and 'A' and respective value is 'Amit' and
 * 'Apple' but output should be only key 'A' and value 'Apple'
 *  */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	Map<String,String> hashMap = new HashMap<String,String>();
	public static void main(String[] args) {
		HashMapEx obj = new HashMapEx();
		obj.insert();
	}
	
	public void insert(){
		hashMap.put("A".toUpperCase(), "Apple");
		hashMap.put("a".toUpperCase(), "Amit");
		hashMap.put("B".toUpperCase(), "Ball");
		hashMap.put("b".toUpperCase(), "Boy");
		System.out.println(hashMap.size());
		
		Set<Entry<String,String>> s = hashMap.entrySet();
		for(Entry<String, String> s1 :s){
			System.out.println(s1.getKey() + "---"+s1.getValue());
		}
	}

}
