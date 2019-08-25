/*Whenever we override the method from parent class to child class and create the Child class 
  object using the
 * reference of Superclass then called the custom function it first give preference to child class method
 * but give preference to the base class primitive type data.
 *  */

package com.cms.polymorphism;

class ChildClass extends BaseClass{
	public int x =1;
	
	public ChildClass(){
		System.out.println("Child Class Constructor");
	}
	
	public void print(){
		System.out.println("In Child Class");
	}
}

class BaseClass{
	public int x =0;
	public BaseClass(){
		System.out.println("Base Class Constructor");
	}
	
	public void print(){
		System.out.println("In Base Class");
	}
}

public class PollymorphismEx1 {
	
	public static void main(String[] args) {
		BaseClass obj = new ChildClass();
		obj.print();
		System.out.println(obj.x);

	}

}
