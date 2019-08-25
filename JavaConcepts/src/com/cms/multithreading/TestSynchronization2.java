/*Synchronized method is used to lock an object for any shared resource.
When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when 
the thread completes its task. */
package com.cms.multithreading;

public class TestSynchronization2 {

	public static void main(String[] args) {
		Table1 obj = new Table1();//only one object  
		Thread t1 =  new Thread(new MineThread1(obj));
		Thread t2 =  new Thread(new MineThread2(obj));
		t1.start();
		t2.start();
	}

}

class Table1{
	synchronized void printTable(int n){
		for(int i=0;i<5;i++){
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
}

class MineThread1 extends Thread{
	Table1 t;
	String name;
	public MineThread1(Table1 t) {
		this.t = t;
		this.name = name;
	}
	public void run(){
		t.printTable(100);
	}
}

class MineThread2 extends Thread{
	Table1 t;
	public MineThread2(Table1 t) {
		this.t = t;
	}
	public void run(){
		t.printTable(5);
	}
}
