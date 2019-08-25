package com.cms.multithreading.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.submit(new Runnable(){
			public void run(){
				
			}
		});
		executor.shutdown();
	}

}
