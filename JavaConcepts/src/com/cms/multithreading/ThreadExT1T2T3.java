/*You have thread T1, T2 and T3, how will you ensure that thread T2 run after T1 and thread T3 run after T2
 */

package com.cms.multithreading;

public class ThreadExT1T2T3 implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		ThreadExT1T2T3 obj = new ThreadExT1T2T3();
		Thread t1 = new Thread(obj,"first_thread");
		Thread t2 = new Thread(obj,"second_thread");
		Thread t3 = new Thread(obj,"third thread");
		t1.start();
		t1.join();	//wait for thread 1 to terminate
		t2.start();
		t2.join();	//wait for thread 2 to terminate
		t3.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

}
