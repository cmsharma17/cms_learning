package com.cms.interviewQues;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedChar {
	
	private static void FirstNonRepeatedChar(String inputStr) {
		Map<Character, Integer> hm = new HashMap<>();
		
		for(char ch : inputStr.toCharArray()) {
			if(hm.get(ch) != null)
				hm.put(ch, hm.get(ch)+1);
			else
				hm.put(ch, 1);
		}
		
		for (Map.Entry<Character, Integer> m : hm.entrySet()){
			if(m.getValue() == 2){
				System.out.println("First Repeated Chars--"+m.getKey());
				break;
			}
		}
	}
	
	public static void main(String args[]) {
		FirstNonRepeatedChar("Chandra");
		FirstNonRepeatedChar("vartika");
		FirstNonRepeatedChar("priyadarshni");
	}
}
