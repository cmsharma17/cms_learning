/*
 * Is this possible to execute the object level locking method and class level locking method simultaneously
 * by two different threads
 *  Ans : yes
 *  */
package com.cms.multithreading;

public class ThreadExample3 implements Runnable{
	
	public void method1(){
		synchronized(this){
			System.out.println("Object level locking method 1 "+Thread.currentThread().getName());
			method2();
		}
	}
	
	public  void method2(){
		synchronized(ThreadExample3.class){
			System.out.println("Class level locking method 2"+Thread.currentThread().getName());
			//method1();
		}
	}
	
	@Override
	public void run() {
		method1();
		method2();
	}
	
	public static void main(String[] args)  {
		ThreadExample3 obj = new ThreadExample3();
		for(int i=1;i<=2;i++){
			Thread t1 = new Thread(obj,"name-"+i);
			t1.start();
		}
		
		ThreadExample3 obj2 = new ThreadExample3();
		for(int i=1;i<=2;i++){
			Thread t2 = new Thread(obj2,"name-"+i);
			t2.start();
		}	
	}
}
