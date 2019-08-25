package com.cms.generics;

public class Test {
	
	static <T> void genericDisplay (T element){
		System.out.println(element.getClass().getName() + "="+ element);
	}
	
	public static void main(String[] args) {
		// Calling generic method with Integer argument
		genericDisplay(11);
		
		// Calling generic method with String argument
		genericDisplay("GeeksForGeeks");
		
		// Calling generic method with double argument
        genericDisplay(1.0);

	}

}
