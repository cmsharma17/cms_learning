package com.cms.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class ComparatorExample {
	public static void main(String args[]){
		List<Student> al = new ArrayList<Student>();
		al.add(new Student(1,"Chandra",20));
		al.add(new Student(12,"Gautam",22));
		al.add(new Student(5,"Shekhar",32));
		
		System.out.println("Sorting by Name...");  
		Collections.sort(al,new NameComparator());
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext()){
			Student st=(Student)itr.next();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		}
		
		System.out.println("sorting by age...");  
		Collections.sort(al,new AgeComparator());
		
		Iterator<Student> itr2 = al.iterator();  
		while(itr2.hasNext()){  
		Student st=(Student)itr2.next();  
		System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		}  
	}
}


class Student{
	int rollNo;
	String name;
	int age;
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator{
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.name.compareTo(s2.name);
	}
}