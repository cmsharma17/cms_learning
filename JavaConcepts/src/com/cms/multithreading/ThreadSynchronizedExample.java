package com.cms.multithreading;

public class ThreadSynchronizedExample implements Runnable{
	//Synchronized Method 1
	public synchronized void testMethod1() {
        try { 
              Thread.sleep(2000);
              System.out.println("testMethod 1--"+Thread.currentThread());
              testMethod2();
        }
        catch (InterruptedException ie) {
        }
    }
	//Synchronized Method 2
    public synchronized void testMethod2() {
        try { 
                Thread.sleep(2000); 
                System.out.println("test method2--"+Thread.currentThread());
       }
        catch (InterruptedException ie) {}
    }
	public static void main(String[] args) throws InterruptedException {
		final ThreadSynchronizedExample test = new ThreadSynchronizedExample();
		Thread t1 = new Thread(test,"firstThread");
			
		Thread t2 = new Thread(test,"SecondThread");
		t1.start();
		Thread.sleep(500);
        t2.start();
        Thread.sleep(500);
        System.out.println(t1.getState());
        System.out.println(t2.getState());

	}
	@Override
	public void run() {
		testMethod1();
		//testMethod2();
		
	}

}
