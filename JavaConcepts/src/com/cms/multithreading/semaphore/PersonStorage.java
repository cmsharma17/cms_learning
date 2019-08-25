package com.cms.multithreading.semaphore;

import java.util.HashMap;
import java.util.Map;

public class PersonStorage {
	private Map<Integer,String> personCache = new HashMap<Integer,String>();
	
	private int counter =0;
	
	private PersonStorage(){
		
	}
	
	private final static class SingletonHolder{
		public static final PersonStorage INSTANCE = new PersonStorage();
	}
	
	public static PersonStorage getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
