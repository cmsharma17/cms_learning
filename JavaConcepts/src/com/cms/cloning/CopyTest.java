package com.cms.cloning;

public class CopyTest {

	  public static void main(String[] args) {
		//Original Object
		Student stud = new Student("John", "Algebra");

		System.out.println("Original Object: " + stud.getName() + " - "
			+ stud.getSubj().getName());

		//Clone Object
		Student clonedStud = (Student) stud.clone();

		System.out.println("Cloned Object: " + clonedStud.getName() + " - "
			+ clonedStud.getSubj().getName());
		
		//mode changes in the original object
		stud.setName("Dan");
		stud.getSubj().setName("Chemistry");//Master stroke --verify

		System.out.println("Original Object after it is updated: " 
			+ stud.getName() + " - " + stud.getSubj().getName());

		System.out.println("Cloned Object after updating original object: "
			+ clonedStud.getName() + " - " + clonedStud.getSubj().getName());

	  }
	}
