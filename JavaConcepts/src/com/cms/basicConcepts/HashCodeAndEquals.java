package com.cms.basicConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEquals {
	public static void main(String args[]){
		Apple a1= new Apple("green");
		Apple a2= new Apple("red");
		
		Map<Apple,Integer> map = new HashMap<Apple, Integer>();
		map.put(a1, 10);
		map.put(a2,20);
		
		System.out.println(map.get(new Apple("green")));
	}
}

class Apple{
	private String color;
	
	public Apple(String color){
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		if(!(obj instanceof Apple))
			return false;
		if(obj == this)
			return true;
		return this.color.equals(((Apple)obj).color);
	}
	
	@Override
	public int hashCode(){
		return this.color.hashCode();	
	}
}