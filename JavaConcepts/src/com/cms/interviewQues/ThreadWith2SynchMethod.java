/* Is this possible to call a two different static synchronized method and Synchronized method by a two different
 * thread simultaneously?
 * Answer - Yes
 * */

package com.cms.interviewQues;

public class ThreadWith2SynchMethod {

	public static void main(String[] args) {
		ThreadWith2SynchMethod obj = new ThreadWith2SynchMethod();
		obj.threadTesting();

	}
	
	//Its a Class level locking
	public synchronized static void method1() {
		System.out.println("Current Thread Execuation method1()::" + Thread.currentThread().getName());
	}
	
	//Its a Object level locking
	public synchronized void method2() {
		System.out.println("Current Thread Execuation method2()::" + Thread.currentThread().getName());
	}

	public void threadTesting() {
		// Thread t1
		Thread t1 = new Thread("First Thread") {
			public void run() {
				method1();
			}
		};

		// Thread t2
		Thread t2 = new Thread("Second Thread") {
			public void run() {
				method2();
			}
		};
		t1.start();
		t2.start();
	}

}
