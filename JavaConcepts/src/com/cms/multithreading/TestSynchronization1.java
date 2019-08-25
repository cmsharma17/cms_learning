	/*In this example, there is no synchronization, so output is inconsistent. */
package com.cms.multithreading;

public class TestSynchronization1 {

	public static void main(String[] args) {
		Table obj = new Table();//only one object  
		Thread t1 =  new Thread(new MyThread1(obj));
		Thread t2 =  new Thread(new MyThread2(obj));
		t1.start();
		t2.start();
	}

}

class Table{
	 void printTable(int n){
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

class MyThread1 extends Thread{
	Table t;
	String name;
	public MyThread1(Table t) {
		this.t = t;
		this.name = name;
	}
	public void run(){
		t.printTable(100);
	}
}

class MyThread2 extends Thread{
	Table t;
	public MyThread2(Table t) {
		this.t = t;
	}
	public void run(){
		t.printTable(5);
	}
}
