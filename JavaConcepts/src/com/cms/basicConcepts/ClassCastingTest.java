package com.cms.basicConcepts;

public class ClassCastingTest {

	public static void main(String[] args) {
		A x = new A();
		B y = new B();
		C z = new C();
		x=y;
		//z=x;
		//z = (C)y;
		//y = (A)y;
		//y = (B)x;

	}

}

class A{}
class B extends A {}
class C extends A {}
