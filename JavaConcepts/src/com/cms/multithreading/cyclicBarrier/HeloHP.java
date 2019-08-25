package com.cms.multithreading.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class HeloHP {
	public static void main(String args[]){
		CyclicBarrier barrier = new CyclicBarrier(4);
		Party first = new Party(1000,barrier,"PARTY-1");
		Party second = new Party(2000,barrier,"PARTY-2");
		Party third = new Party(3000,barrier,"PARTY-3");
		Party fourth = new Party(4000,barrier,"PARTY-4");
		
		first.start();
		second.start();
		third.start();
		fourth.start();
		
		System.out.println(Thread.currentThread().getName()+ "Has Finished");
	}
}
