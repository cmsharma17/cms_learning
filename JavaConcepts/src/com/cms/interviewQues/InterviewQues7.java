package com.cms.interviewQues;

public class InterviewQues7 {

	public static void main(String[] args) {
		TestThread obj = new TestThread();
		Thread t1 = new Thread(obj,"first");
		t1.start();
		Thread t2 = new Thread(obj,"second");
		t2.start();
		//t2.start();
		Thread t3 = new Thread(obj,"third");
		t3.run();

	}

}

class TestThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
