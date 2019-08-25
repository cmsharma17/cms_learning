package com.cms.multithreading.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable{
	private final CountDownLatch latch;
	private final String[] items;
	
	FoodProcessor(CountDownLatch latch, String items[]){
		this.latch = latch;
		this.items = items;
	}
	
	
	@Override
	public void run() {
		for(int i =0; i<items.length; i++){
			try {
				Thread.sleep(10000);
				System.out.println("Before Processing the  item, value of CountDownLatch:"+latch.getCount());
				System.out.println("Items:"+items[i]+ "Is prepared");
				latch.countDown();
				System.out.println("After Processing the  item, value of CountDownLatch:"+latch.getCount());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
