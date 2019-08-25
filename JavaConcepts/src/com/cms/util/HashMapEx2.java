package com.cms.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {
	Map<String,Employee> hashMap = new LinkedHashMap<String,Employee>(); //Stored on the order in which elements are inserted
	//Map<String,Employee> hashMap = new HashMap<String,Employee>();  //Stored on the random order
	//Map<String,Employee> hashMap = new TreeMap<String,Employee>();  //Sorted on the basis of key
	public static void main(String args[]){
		HashMapEx2 obj = new HashMapEx2();
		obj.insert();
		obj.dispaly();
	}
	
	public void insert(){
		hashMap.put("First", new Employee("Chandra",1,"Mumbai"));
		hashMap.put("Second", new Employee("Shekhar",2,"Pune"));
		hashMap.put("Third", new Employee("Shalini",3,"Jamshedpur"));
	}
	
	public void dispaly(){
		Set<Entry<String,Employee>> s = hashMap.entrySet();
		for(Map.Entry<String, Employee> e: s){
			System.out.println(e.getKey()+"-----"+e.getValue().name+","+e.getValue().id+", "+e.getValue().add);
		}
	}
}

class Employee{
	String name;
	int id;
	String add;
	
	public Employee(String name, int id, String add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}
	
	
}
