package com.cms.programming.interviewQuestions;

import java.util.Scanner;

public class FindNumberOfOccurencesOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string-");
		String str = sc.nextLine();
		
		int initialLength = str.length();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the char to find the occurence-");
		String ch = sc1.nextLine();
		
		str = str.replace(ch, "");
		int finalLength = str.length();
		
		System.out.println("Total Number of occurences of Char -"+ch+" is "+(initialLength-finalLength));
		

	}

}
