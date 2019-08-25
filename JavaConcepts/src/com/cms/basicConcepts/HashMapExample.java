package com.cms.basicConcepts;

/*If we inserted the different value on the same key then it override with the latest value */

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		hm.put("Chandra", "Sharma");
		hm.put("Chandra", "Mouli");
		System.out.println("size::"+hm.size());
		for(Map.Entry<String, String> me : hm.entrySet()){
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}

	}

}
