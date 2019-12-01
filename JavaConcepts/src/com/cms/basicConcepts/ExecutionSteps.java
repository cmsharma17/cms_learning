package com.cms.basicConcepts;
/*Below example explain the execution steps of different levels.
 * a) Static block
 * b) Normal Block
 * c) Construtor
 * */
public class ExecutionSteps {
	ExecutionSteps() {
		System.out.println("Constructor calling");
	}

	static {
		System.out.println("This is static block");
	}
	{
		System.out.println("This is normal block");
	}

	static void display() {
		System.out.println("Static display method");
	}
	
	void print() {
		System.out.println("Print method..");
	}

	public static void main(String args[]) {
		ExecutionSteps obj = new ExecutionSteps();
		obj.print();
		ExecutionSteps.display();
	}
 
}
