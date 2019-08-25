package com.cms.multithreading;

public class MyDaemonThread extends Thread{
	
	public MyDaemonThread(){
		setDaemon(true);
	}
	
	@Override
	public void run(){
		while(true){
			try{
				Thread.sleep(1);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new MyDaemonThread();
		thread.start();
	}

}
