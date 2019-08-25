package com.cms.interviewQues;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

	public static void main(String[] args) {
		Map<String,String> chm = new ConcurrentHashMap<>();
		//insert
		
		chm.put("1", "First");
		chm.put("2", "Second");
		chm.put("3", "Third");
		
		System.out.println(chm);
		
		//update
		
		if(chm.containsKey("3"))
			chm.replace("3", "Updated Value");
		
		System.out.println("After updation::"+chm);

	}

}
