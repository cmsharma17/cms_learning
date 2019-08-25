package com.cms.multithreading.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	private BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> q){
		this.queue = q;
	}

	@Override
	public void run() {
		Message msg;
		try {
			while((msg = queue.take()).getMessage() != "Exit"){
				Thread.sleep(10);
				System.out.println("Consumed "+msg.getMessage());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
