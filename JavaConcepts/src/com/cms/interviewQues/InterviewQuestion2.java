/*You have one super class that have one method, which is extended by the sub class and override the
 * same method, once you create the Object of base class with the reference of super class and called the
 * same method, then which method actually called ?
 *  */
package com.cms.interviewQues;

public class InterviewQuestion2 {
	public static void main(String args[]){
		A a = new B();
		a.testA();
	}
}

class A{
	public void testA(){
		System.out.println("Class A");
	}
}

class B extends A{
	public void testA(){
		System.out.println("Class B");
	}
}
