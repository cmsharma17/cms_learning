package com.cms.multithreading;

import java.util.ArrayList;
import java.util.List;

public class MultipleProducer {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		Producer1 obj = new Producer1(list);
		Thread t1 = new Thread(obj, "String Thread");
		t1.start();
		Thread t2 = new Thread(obj, "Integer Thread");
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Consumer cons = new Consumer(list);
		Thread t3 = new Thread(cons, "Consumer Thread");
		t3.start();
	}
}

class Producer1 implements Runnable {
	List list = new ArrayList();
	
	public Producer1(List list) {
		this.list = list;
	}

	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
		String threadName = Thread.currentThread().getName();
		if (threadName.equals("String Thread")) {
			for (int i = 0; i < 10; i++) {
				list.add("Element-" + i);
				System.out.println("Produce--"+"string Element-" + i);
			}
		}
		if (threadName.equals("Integer Thread")) {
			for (int i = 0; i < 5; i++) {
				list.add(new Integer(i));
				System.out.println("Produce--"+"Integer Element-" + i);
			}
		}
	}
}

class Consumer implements Runnable{
	List list = new ArrayList();
	public Consumer(List list){
		this.list = list;
	}
	@Override
	public void run() {
		System.out.println(list.size());
	}
}
