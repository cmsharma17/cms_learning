package com.cms.multithreading.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CabService implements Runnable{
	
	CyclicBarrier cyclicbarrier ;
	public CabService(CyclicBarrier cyclicbarrier) {
		this.cyclicbarrier = cyclicbarrier;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" Has arrived");
		try {
			cyclicbarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " Is going to board the cab");	
	}
}
