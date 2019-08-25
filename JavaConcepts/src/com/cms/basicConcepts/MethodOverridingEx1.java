package com.cms.basicConcepts;

public class MethodOverridingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Horse();
	}

}

class Animal{
	Animal(){
		System.out.println("Animal Constructor Calling");
		display();
	}
	
	public void display(){
		System.out.println("This is Animal");
	}
}

class Horse extends Animal{
	Horse(){
		System.out.println("Hourse Constructor Calling");
		display();
	}
	public void display(){
		System.out.println("This is Horse");
	}
}
