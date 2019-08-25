package com.cms.multithreading;

public class ThreadLocalExample{
	
	public static class MyRunnable implements Runnable{
		
		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
		public void run() {
			threadLocal.set( (int) (Math.random() * 100D) );
			try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
    
            System.out.println(threadLocal.get());
		}
		
	}
	
	public static void main(String args[]) throws InterruptedException{
		MyRunnable sharedRunnaleInstance = new MyRunnable();
		
		Thread t1= new Thread(sharedRunnaleInstance);
		Thread t2= new Thread(sharedRunnaleInstance);
		t1.start();
		t2.start();
		t1.join();		//wait for thread 1 to terminate
		t2.join();		//wait for thread 2 to terminate
	}
}