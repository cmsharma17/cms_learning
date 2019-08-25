package com.cms.multithreading.Concurrency;

public class Main {

	public static void main(String[] args) {
		Resource r = new Resource();
		ConcurrencyLockExample obj = new ConcurrencyLockExample(r);
		new Thread(obj).start();
		new Thread(obj).start();

	}

}
