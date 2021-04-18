package com.cms.programming.interviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CompressString {
	public static void main(String args[]) {
		compressStr("chandra");
	}
	
	public static void compressStr(String s) {
		HashMap<Character, Integer> hm = new LinkedHashMap<>();//maintain the order
		//char[] ch = s.toCharArray();
		for(Character ch : s.toCharArray()) {
			if (!hm.containsKey(ch)) {
				//System.out.println("value::"+hm.get(ch));
				hm.put(ch, 1);
			}else {
				hm.put(ch, (hm.get(ch))+1);
			}
		}
		
		hm.forEach((K,V) -> {
			if(Integer.parseInt(V.toString()) > 1)
				System.out.print(K.toString()+V.toString());
			else
				System.out.print(K.toString());
		});
		
		
		//hm.entrySet().stream().
	}
}
