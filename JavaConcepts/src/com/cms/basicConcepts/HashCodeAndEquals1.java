package com.cms.basicConcepts;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals1 {

	public static void main(String[] args) {
		Student s1 = new Student("John", 18);
		Student s2 = new Student("John", 18);
		System.out.println("##--"+s1.hashCode());
		System.out.println("$$--"+s2.hashCode());
		
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
		for(Student s : set){
			System.out.println(s.name +"::::"+s.age);
		}
	}

}

class Student{
	String name;
	Integer age;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int hashCode(){
		System.out.println("Hash Code name::"+this.name.hashCode());
		return this.name.hashCode();
	}
	
	public boolean equals(Object obj){
		if(obj==null)
			return false;
		if(!(obj instanceof Student))
			return false;
		return this.name.equals(((Student)obj).name);
	}
}
