package com.cms.interviewQues;

public class ThreadingQuest {

	public static void main(String[] args) {
		EmployeeThread obj = new EmployeeThread();
		Thread t1 = new Thread("first thread"){
			@Override
			public void run(){
				obj.methodA();
			}
		};
		
		Thread t2 = new Thread("second thread"){
			@Override
			public void run(){
				obj.methodB();
			}
		};
		
		t1.start();
		t2.start();

	}

}

class EmployeeThread{
	public  synchronized void methodA(){
		System.out.println("Inside method A..."+Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
			//methodB();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static synchronized void methodB(){
		System.out.println("Inside method B..."+Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
