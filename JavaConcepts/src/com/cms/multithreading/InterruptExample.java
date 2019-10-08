package com.cms.multithreading;
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
