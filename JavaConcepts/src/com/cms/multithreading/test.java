package com.cms.multithreading;

class A{
	public void method1() throws Exception{
		System.out.println("class A method1");
	}
}

class B extends A{
	public  void method1() throws ClassNotFoundException{
		System.out.println("class B method1");
	}
}

public class test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		B b = new B();
		b.method1();
		A a = new B();
		a.method1();

	}

}
