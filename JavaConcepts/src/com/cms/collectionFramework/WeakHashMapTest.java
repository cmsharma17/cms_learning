/*The java.util.WeakHashMap class is a hashtable-based Map implementation with weak keys. An entry in a 
 * WeakHashMap will automatically be removed by the garbage collector, when its key is no longer in use.*/

package com.cms.collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {
		Map hashMap = new HashMap();

		Map weakHashMap = new WeakHashMap<>();

		String keyHashMap = new String("keyHashMap");
		String keyWeakHashMap = new String("keyWeakHashMap");

		hashMap.put(keyHashMap, "Chandra");
		hashMap.put(keyWeakHashMap, "abcdf124");
		System.out.println(weakHashMap.get("keyWeakHashMap"));
		System.gc();

		System.out.println("Before: hash map value:" + hashMap.get("keyHashMap") + " and weak hash map value:"
				+ weakHashMap.get("keyWeakHashMap"));

		keyHashMap = null;
		keyWeakHashMap = null;

		System.gc();

		System.out.println("After: hash map value:" + hashMap.get("keyHashMap") + " and weak hash map value:"
				+ weakHashMap.get("keyWeakHashMap"));
		System.out.println("size:"+weakHashMap.size());

	}

}
