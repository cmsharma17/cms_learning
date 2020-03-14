package com.cms.multithreading.interviewQues1;

public class ThreadExample1 {
	public static void main(String args[]) {
		// Anonymous Runnable
        Runnable task1 = new Runnable(){
          @Override
          public void run(){
            System.out.println(Thread.currentThread().getName() + " is running");
          }
        };
		
     // Passing a Runnable when creating a new thread
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });
        
     // Lambda Runnable
        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        };
        
        Thread thread1 = new Thread(task1);
        
        thread1.start();
        thread2.start();
 
        new Thread(task3).start();
        
        Task task = new Task();
		Thread t1 = new Thread(new Task() {

		});
		t1.start();

		Thread t2 = new Thread(task, "Second");
		t2.start();
        
	}
}
class Task implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"--######");
	}

}
