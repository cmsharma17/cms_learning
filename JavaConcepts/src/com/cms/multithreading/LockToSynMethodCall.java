package com.cms.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockToSynMethodCall {
	public static void main(String args[]){
		Person p1 = new Person();
		new Thread(p1,"First Thread").start();
		new Thread(p1,"Second Thread").start();
	}
}

class Person implements Runnable{
	private Lock lock;
	
	Person(){
		this.lock = new ReentrantLock();
	}
	
	@Override
	public void run() {
		lock.lock();//acquired the lock at the Object level
		System.out.println("run calling--"+Thread.currentThread().getName());
		method2(); //called the synchronized method call
		lock.unlock();
	}
	
	public synchronized void method2(){
		System.out.println("method2 called--"+Thread.currentThread().getName());
	}
	
}
