package com.cms.util;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeWithHashMapEx {
	public static void main(String args[]) {
		HashMap<Student, String> hm = new HashMap<>();
		
		hm.put(new Student("Chandra", 1), "Chandra");
		hm.put(new Student("Sharma", 1), "Sharma");
		
		System.out.println(hm.size());
	}
}

class Student{
	String name;
	int id;
	
	
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object o){
		System.out.println("Calling equals methods::");
		Student e = (Student) o;
		return (this.getId()== e.getId());
	}
	
	@Override
	public int hashCode(){
		
	    return 1;
	    //return Objects.hash(id, name);
	    
	    //For JDK 7 and above, you can use the new Objects class to generate the equals and hash code values.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
