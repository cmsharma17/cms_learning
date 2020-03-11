package com.cms.interviewQues;

import java.util.HashMap;
import java.util.Map;

/*Java Program to find duplicate characters in String. */

public class FindDuplicateCharacters {
	static String inputStr = "ChandraMouliSharma";
	public static void main(String args[]) {
		findDuplicate(inputStr);
	}
	private static void findDuplicate(String str) {
		char[] inputChars = str.toCharArray();
		
		Map<Character, Integer> hm = new HashMap<>();
		for(char ch : inputChars) {
			if(hm.get(ch) != null) {
				hm.put(ch, hm.get(ch) + 1);
			}else {
				hm.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> val : hm.entrySet()) {
			if(val.getValue() > 1) {
				System.out.print(" " +val.getKey().toString().toUpperCase());
			}
		}
		
	}
}
