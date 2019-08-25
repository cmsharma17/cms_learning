package com.cms.basicConcepts;

public class ImmutableTest {
	public static void main(String ags[]) {
		String initial = "ABCDEFG";
		String after = initial.replace('A', 'Z');
		System.out.println("initial = " + initial);
		System.out.println("after= " + after);
	}
}
