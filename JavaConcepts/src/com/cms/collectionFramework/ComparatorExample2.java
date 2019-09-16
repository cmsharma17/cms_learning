package com.cms.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample2 {
	List<Name> nameList = new ArrayList<Name>();
	public static void main(String args[]) {
		new ComparatorExample2().sortName();
	}

	public void sortName() {
		nameList.add(new Name("chandra", "sharma"));
		nameList.add(new Name("shalini", "saraaf"));
		nameList.add(new Name("ravindra", "nath"));
		nameList.add(new Name("ranjana", "sharma"));
		nameList.add(new Name("vartika", "priyadarshani"));
		nameList.add(new Name("shikha", "verma"));
		
		//Sort ArrayList on the basis of First Name
		Collections.sort(nameList, new FirstNameComparator());
		System.out.println("\nSort on the basis of First name");
		displayList();
		//Sort ArrayList on the basis of Last Name
		Collections.sort(nameList, new LastNameComparator());
		System.out.println("\nSort on the basis of last name");
		displayList();

	}
	
	public void displayList() {
		for (Name name : nameList) {
			System.out.print(name.firstName+"-"+name.lastName+",");
		}
	}
}

class Name {
	public String firstName;
	public String lastName;

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

class FirstNameComparator implements Comparator<Name> {

	@Override
	public int compare(Name o1, Name o2) {
		return o1.firstName.compareTo(o2.firstName);
	}

}

class LastNameComparator implements Comparator<Name> {

	@Override
	public int compare(Name o1, Name o2) {
		return o1.lastName.compareTo(o2.lastName);
	}

}
