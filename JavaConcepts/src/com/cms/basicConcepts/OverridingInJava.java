package com.cms.basicConcepts;

public class OverridingInJava {

	public static void main(String[] args) {
		BBB b = new BBB();
		b.testA();
		AAA a = new BBB();
		a.testA();
		//a.testB();//It gives compile time errro
	}

}

class AAA{
	public void testA(){
		System.out.println("Class A");
	}
}

class BBB extends AAA{
	public void testA(String srr){
		System.out.println(srr);
	}
}
