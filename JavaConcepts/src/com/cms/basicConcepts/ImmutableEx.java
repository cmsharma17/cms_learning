package com.cms.basicConcepts;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableEx {
	private final int id;
	private final String name;
	private final HashMap<String,String> testMap;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	/**
	 * Accessor function for mutable objects
	 */
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}
	
	public ImmutableEx(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing DeepCopy for Object Initialization..");
		this.id = i;
		this.name = n;
		HashMap<String,String> tempMap = new HashMap<String,String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()){
			key = it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap;
	}
	
	public static void main(String args[]){
		HashMap<String,String> h1 = new HashMap<String,String>();
		h1.put("1", "First");
		h1.put("2", "Second");
		h1.put("3", "Third");
		
		String s = "Original";
		
		int i =10;
		
		ImmutableEx obj = new ImmutableEx(i, s, h1);
		
		//Lets see whether its copy by field or reference
		System.out.println(s==obj.getName());
		System.out.println(i==obj.getId());
		System.out.println(h1==obj.getTestMap());
		
		//print the obj values
		System.out.println("Obj Id ::"+obj.getId());
		System.out.println("Obj Name::"+obj.getName());
		System.out.println("Obj Test Map::"+obj.getTestMap());
		
		//change the local variable values
		i = 20;
		s = "Modified";
		h1.put("4", "Fourth");
		
		//print the values again
		
		System.out.println("Obj Id after local variable change::"+obj.getId());
		System.out.println("Obj Name after local variable change::"+obj.getName());
		System.out.println("Obj Test Map after local variable change::"+obj.getTestMap());
	}
}
