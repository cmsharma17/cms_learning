package com.cms.multithreading;

public class ThreadYieldExample implements Runnable{
	Thread t;
	public ThreadYieldExample(String str){
		t = new Thread(this, str);
		t.start();
	}
	
	public static void main(String[] args) {
		new ThreadYieldExample("Thread 1");
		new ThreadYieldExample("Thread 2");
		new ThreadYieldExample("Thread 3");

	}

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			// yields control to another thread every 5 iterations
			if(i%5 ==0){
				System.out.println(Thread.currentThread().getName() + "yielding control...");
				/* causes the currently executing thread object to temporarily 
				   pause and allow other threads to execute */
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished executing.");	
	}
}
