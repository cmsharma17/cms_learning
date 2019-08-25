/* Need to get an online food order having various food items i.e. Pizza Pasta Salad
 * Start tracking the processing of the food in another thread
 * Once all the food items are prepared, need to notify the customer that food is prepared.
 * 
 * */

package com.cms.multithreading.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class FoodProcessorMain {
	public static void main(String args[]){
		final CountDownLatch countDownLatch = new CountDownLatch(args.length);
		Thread foodProcessorThread = new Thread(new FoodProcessor(countDownLatch,args));
		foodProcessorThread.start();
		try {
			System.out.println("Order is received and is being processed");
			countDownLatch.await();
			System.out.println("Order is processed successfully and is ready to get dispatch");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
