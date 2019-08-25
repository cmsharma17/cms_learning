package com.cms.cloning;

class Student implements Cloneable {
	  //Contained object
	  private Subject subj;

	  private String name;

	  public Subject getSubj() {
		return subj;
	  }

	  public String getName() {
		return name;
	  }

	  public void setName(String s) {
		name = s;
	  }

	  public Student(String s, String sub) {
		name = s;
		subj = new Subject(sub);
	  }

	  //Clone the Object and create the Shallow copy
	  public Object clone() {
		//shallow copy
		try {
		  return super.clone();
		} catch (CloneNotSupportedException e) {
		  return null;
		}
	  }
	}