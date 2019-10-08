//Can we write the main method in the abstract class ?
package com.cms.basicConcepts;

public class abstractA {
	
	public abstractA(){}
	
	private void doSomething(){
		System.out.println("A");
	}
	
	public static void main(String args[]){
		abstractA A =  new abstractB();//This is called upcasting
		A.doSomething();
	}
}

class abstractB extends abstractA{
	
	public abstractB(){}
	
	protected void doSomething(){
		System.out.println("B");
	}
}
