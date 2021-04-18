package com.cms.multithreading;

/* 
 The interrupt() method of thread class is used to interrupt the thread. If any thread is in sleeping or 
 waiting state (i.e. sleep() or wait() is invoked) then using the interrupt() method, we can interrupt the thread execution by throwing InterruptedException.

If the thread is not in the sleeping or waiting state then calling the interrupt() method performs a normal 
behavior and doesn't interrupt the thread but sets the interrupt flag to true.
  */
public class InterruptExample implements Runnable{
	
    public static void main(String[] args) throws InterruptedException {
        Thread t= new Thread(new InterruptExample(), "myThread");
        t.start();
        System.out.println("["+Thread.currentThread().getName()+"] Sleeping in main thread for 5s...");
        Thread.sleep(5000);
        System.out.println("["+Thread.currentThread().getName()+"] Interrupting myThread");
        t.interrupt();
    }

	@Override
	public void run() {
		try {
			Thread.sleep(Long.MAX_VALUE);
		} catch (InterruptedException e) {
			System.out.println("["+Thread.currentThread().getName()+"] Interrupted by exception!");
		}
		
	}
}
