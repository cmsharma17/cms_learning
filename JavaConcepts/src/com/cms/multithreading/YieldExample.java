package com.cms.multithreading;

/*
 * A yielding thread tells
the virtual machine that it’s willing to let other threads be scheduled in its place. This indicates
that it’s not doing something too critical.
 * */
public class YieldExample {
	
	public static void main(String args[]) {
		Producer producer = new Producer();
		Thread t1= new Thread(producer);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		
		Consumer1 consumer = new Consumer1();
		Thread t2= new Thread(consumer);
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
	}
	
}

class Producer extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Producer : Produced Item " + i);
			Thread.yield();
		}
	}
}

class Consumer1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Consumer : Produced Item " + i);
			Thread.yield();
		}
	}
}
