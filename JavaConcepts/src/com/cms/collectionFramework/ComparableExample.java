package com.cms.collectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {
	public static void main(String args[]){
		List<Employee> list = new ArrayList();
		list.add(new Employee(1,"chandra"));
		list.add(new Employee(3,"Rambo"));
		list.add(new Employee(5,"Sharma"));
		list.add(new Employee(7,"Gautam"));
		list.add(new Employee(4,"Pranky"));
		System.out.println("Before sorting by Id---");
		
		for(Employee a: list)   // printing the sorted list of names
	         System.out.print(a.getName() + "- "+a.getId() +",");
		
		System.out.println("\nAfter sorting by Id---");
		Collections.sort(list);
		for(Employee a: list)   // printing the sorted list of names
	         System.out.print(a.getName() + "- "+a.getId()+",");
	}
}

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return this.id - o.id;
		//return (this.name).compareTo(d.name);
		return (this.name).compareTo(o.name);
	}
}
