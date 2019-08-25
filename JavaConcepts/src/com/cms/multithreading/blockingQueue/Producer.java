package com.cms.multithreading.blockingQueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable{
	private BlockingQueue<Message> queue ;	
	public Producer(BlockingQueue<Message> q){
        this.queue=q;
    }	
	@Override
	public void run() {
		for(int i =0;i<100;i++){
			Message msg = new Message(""+i);
			try {
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced "+msg.getMessage());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//adding exit message
		Message msg = new Message("Exit");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
