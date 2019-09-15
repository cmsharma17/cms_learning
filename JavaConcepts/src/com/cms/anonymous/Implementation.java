package com.cms.anonymous;

public class Implementation {
	
	/*
	* This looks like we are creating an object of Apple class, but actually we
	* we have created an instance of anonymous subclass of Apple. The statement
	* written below creates an anonymous inner class with an instance of it and
	* the class is a subclass to Apple.
	*/
	
	Apple apple = new Apple() {
		@Override
		public void print() {
			super.print();
			System.out.println("Printed from sub class of Apple !");
		}
		
		public void add() {
			System.out.println("I am not present in Apple !");
		}
	};
	
	
	public void r() {
		apple.print();
		//apple.add();
		/*
		* apple.add();
		 *
		 * This will give a compilation error because, from a
		 * superclass reference variable we can not call a member of subclass
		 * that is not present in superclass.
		*/
	}
	public static void main(String args[]) {
		new Implementation().r();
	}
}
