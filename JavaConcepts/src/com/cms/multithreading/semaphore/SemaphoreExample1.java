package com.cms.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample1 {
	public static void main(String args[]){
		Semaphore semaphore = new Semaphore(2);
		MyThread m1 = new MyThread(semaphore);
		MyThread m2 = new MyThread(semaphore);
		
		MyThread m3 = new MyThread(semaphore);
		MyThread m4 = new MyThread(semaphore);
		
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		
	}
}

class MyThread extends Thread{
	Semaphore semaphore;
	public MyThread(Semaphore semaphore){
		this.semaphore = semaphore;
	}
	
	public void run(){
		try{
			semaphore.acquire();
			System.out.println("Hello" +this.getName());
			try{
				sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			semaphore.release();
			System.out.println("Good Bye::"+this.getName());
		}
	}
}
