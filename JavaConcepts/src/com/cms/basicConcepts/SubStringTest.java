package com.cms.basicConcepts;


import java.util.Arrays;
import java.lang.reflect.Field;

public class SubStringTest {
	public static void main(String args[]) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		String mainString = "i_love_java";
		String subString = mainString.substring(7);
		System.out.println("mainString::"+mainString);
		System.out.println("subString::"+subString);
		
		//Lets see what's inside mainString
		Field innerCharArray = String.class.getDeclaredField("value");
		innerCharArray.setAccessible(true);
		
		char[] chars = (char[]) innerCharArray.get(mainString);
		System.out.println(Arrays.toString(chars));
		
		//Now peek inside subString
		chars = (char[]) innerCharArray.get(subString);
		System.out.println(Arrays.toString(chars));
	}
}
