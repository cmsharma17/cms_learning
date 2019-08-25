/*Can two different threads operate on two different synchronized  methods of the same  class  
 * simultaneously? 
 * 
 * Well this depends on whether the two threads that try to access the synchronized methods are accessing 
 * the methods using the same object of the class or using different objects of the class.
 * 
 * Accessing the methods using the same object :

What happens when a thread invokes a synchronized method?
In that situation the thread automatically acquires the intrinsic lock for that method's object. 
Since there is only one lock per object, if one thread has picked up the lock, no other thread can 
pick up the lock until the first thread releases (or returns) the lock..
And therefore this prevents multiple threads from calling synchronized methods on the same 
instance simultaneously (note that this also prevents different synchronized methods from getting 
called on the same instance simultaneously).
 * */
package com.cms.multithreading;

public class TwoThreadTwoSynchMethodSameObj {

	public synchronized void method1() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void method2() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		TwoThreadTwoSynchMethodSameObj obj = new TwoThreadTwoSynchMethodSameObj();
		Thread t1 = new Thread("First Thread") {
			public void run() {
				obj.method1();
			}
		};

		Thread t2 = new Thread("Second Thread") {
			public void run() {
				obj.method2();
			}
		};

		t1.start();
		Thread.sleep(500);
		t2.start();
		Thread.sleep(500);
		System.out.println(t2.getState());
	}

}
