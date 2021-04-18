package com.cms.programming.interviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GetFirstLetterOfEachWord {

	public static void main(String[] args) {
		getfirstLetter("My Name is Chandra");

	}
	
	public static void getfirstLetter(String s) {
		String[] words = s.split(" ");
		
		
		String firstLetterOfWord = Arrays.stream(words).map(s1 -> s1.substring(0,1)).collect(Collectors.joining());
		System.out.println(firstLetterOfWord);
	}
	
	

}
