package com.cms.java8.defaultmethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {
	public static void main(String args[]){
		List<Integer> myList = new ArrayList<Integer>();
		for(int i =0; i<10; i++)
			myList.add(i);
		
		//traversing using Iterator
		
		Iterator<Integer> itr = myList.iterator();
		while(itr.hasNext()){
			System.out.println("Iterator Value:"+itr.next());
		}
		
		//traversing through forEach method of Iterable with anonymous class
		
		myList.forEach(new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				System.out.println("For each anonymous class value::"+t);
			}
		});
		
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
	}
}

//Consumer implementation that can be reused

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
		
	}
	
}
