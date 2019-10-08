package com.cms.basicConcepts;

/*When reference variable of Parent class refers to the object of Child class, it is known as
upcasting. For example:*/

public class UpcastingExample {
	public static void main(String []rags) {
		Bike b = new Splender();
		b.run();
	}
}


class Bike{
	public Bike() {
		System.out.println("Bike Constructor");
	}
	public void run() {
		System.out.println("This is Bike");
	}
}

class Splender extends Bike{
	public Splender() {
		System.out.println("Splender Constructor");
	}
	@Override
	public void run() {
		System.out.println("This is Splender");
	}
}

