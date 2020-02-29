package com.cms.basicConcepts;

//Can't assign on super class instance on the sub class instance  
public class ClassCastingTest {

	public static void main(String[] args) {
		A x = new A();
		B y = new B();
		C z = new C();
		x=y;
		x =z;
		//y=z;
		//z=x;
		//z = (C)y;
		//y = (A)y;
		//y = (B)x;

	}

}

class A{}
class B extends A {}
class C extends A {}
