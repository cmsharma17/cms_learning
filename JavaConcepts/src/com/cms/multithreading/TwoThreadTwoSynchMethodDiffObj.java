/*Accessing the methods using different objects :
 * 
Now, since we have two instances of our class, each instance gets its own lock. 
There's nothing to prevent the two threads each operating on its own instance concurrently.
 */

/*The state of thread is  TIMED_WAITING when the thread that is waiting for another thread to 
 * perform an action for up to a specified waiting time.
 */

package com.cms.multithreading;

public class TwoThreadTwoSynchMethodDiffObj {
	public synchronized void testMethod1() {
		try {
			System.out.println("--"+Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
	}

	public synchronized void testMethod2() {
		try {
			System.out.println("--"+Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
	}

	public static void main(String[] args) throws InterruptedException {
		final TwoThreadTwoSynchMethodDiffObj test1 = new TwoThreadTwoSynchMethodDiffObj();
		final TwoThreadTwoSynchMethodDiffObj test2 = new TwoThreadTwoSynchMethodDiffObj();
		Thread t1 = new Thread("First") {
			public void run() {
				test1.testMethod1();
			}
		};
		Thread t2 = new Thread("Second") {
			public void run() {
				test2.testMethod2();
			}
		};
		t1.start();
		Thread.sleep(500);
		t2.start();
		Thread.sleep(500);
		System.out.println("Thread t1 state-"+t1.getState());
		System.out.println("Thread t2 state-"+t2.getState());
	}
}
