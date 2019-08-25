package com.cms.multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("Strarting main thread...");
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();
		System.out.println("Thread Name::"+Thread.currentThread().getName());
		System.out.println("End of Main Thread...");	
	}

}

class MyRunnableThread implements Runnable{
	static int myRunnableCount = 0;
	@Override
	public void run() {
		while(myRunnableCount<=10){
			System.out.println("Expl Thread::"+ (++MyRunnableThread.myRunnableCount));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
