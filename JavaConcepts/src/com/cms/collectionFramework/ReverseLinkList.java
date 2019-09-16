package com.cms.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseLinkList {
	public static void main(String args[]) {
		new ReverseLinkList().reverseEmployee();
	}
	public void reverseEmployee() {
		List<Employee1> listEmp = new ArrayList();
		Employee1 e1 = new Employee1(3, "Chandra");
		Employee1 e2 = new Employee1(5, "Sudhir");
		Employee1 e3 = new Employee1(7, "Fantom");
		listEmp.add(e1);
		listEmp.add(e2);
		listEmp.add(e3);
		System.out.println("-- Before reversing --");
		for(Employee1 e : listEmp) {
			System.out.print(e.id +":-"+e.name+",");
		}
		
		Collections.reverse(listEmp);
		
		System.out.println("\n-- After reversing --");
		for(Employee1 e : listEmp) {
			System.out.print(e.id +":-"+e.name+",");
		}
		
	}
}

class Employee1{
	String name;
	int id;
	public Employee1(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}
