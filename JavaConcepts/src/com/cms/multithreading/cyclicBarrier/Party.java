package com.cms.multithreading.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Party extends Thread{
	private int duration;
	private CyclicBarrier barrier;
	
	public Party(int duration, CyclicBarrier barrier, String name){
		super(name);
		this.duration =  duration;
		this.barrier = barrier;
	}
	
	@Override
	
	public void run(){
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName() + "is calling await()");
			barrier.await();
			System.out.println(Thread.currentThread().getName() + "started running again");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
