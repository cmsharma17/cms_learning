/*Write a cab transport service when passenger will come one by one and join the queue but the can't board
 * the cab or cab won't move until there are three passengers are ready to board.
 *  */

package com.cms.multithreading.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CabServiceMain {
	public static void main(String args[]) throws InterruptedException{
		CyclicBarrier cyclicbarrier = new CyclicBarrier(3);
		
		Thread t1 =  new Thread(new CabService(cyclicbarrier),"Passanger1");
		t1.start();
		Thread.sleep(1000);
		Thread t2 = new Thread(new CabService(cyclicbarrier),"Passanger2");
		t2.start();
		Thread.sleep(1000);
		Thread t3 = new Thread(new CabService(cyclicbarrier),"Passanger3");
		t3.start();
		Thread.sleep(1000);
		Thread t4 = new Thread(new CabService(cyclicbarrier),"Passanger4");
		t4.start();
		Thread.sleep(1000);
		
	}
}
