package com.cms.basicConcepts;

public class OverloadingTest {
	public static void main(String args[]){
		A1 obj = new B1();
		//obj.methodB1(); //It gives compile time errro
	}
}

class A1{
	public void methodA1(){
		System.out.println("PRINT A1 method");
	}
}

class B1 extends A1{
	public void methodB1(){
		System.out.println("PRINT B1 method");
	}
}
