package com.cms.interviewQues;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ReverseString {

	public static void main(String[] args) {
		String s ="";
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Write any string::");
			s = br.readLine();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		char ch[] = s.toCharArray();
		//char ch[] = s.toCharArray();
		System.out.println(ch.length);
		for(int i =ch.length-1; i>=0 ;i--){
			System.out.print(ch[i]);
		}
	}

}
