/*What's happen when you called the the thread from synchronized method to non synchronized method? */

package com.cms.multithreading;

public class SynToNonSynMethodEx {

	public static void main(String[] args) {
		Employee e = new Employee();
		Thread t1 = new Thread(e);
		t1.start();
		Thread t2 = new Thread(e);
		t2.start();

	}

}

class Employee implements Runnable{
	public void run() {
		method1();
	}
	public synchronized void method1(){
		System.out.println("synchronized method1--"+Thread.currentThread().getName());
		method2();
	}
	
	public void method2(){
		System.out.println("Normal method2--"+Thread.currentThread().getName());
	}
}
