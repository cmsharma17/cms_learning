package com.cms.multithreading.volatileAndAtomic;

public class WithOutVolatile {
	public static void main(String[] args) throws InterruptedException {
		SharedResources sharedResources = new SharedResources();
		Thread t1 = new Thread(sharedResources,"First");
		Thread t2 = new Thread(sharedResources, "Second");
		t1.start();
		//Thread.sleep(3000);
		t2.start();
	}

	public static class SharedResources implements Runnable {
		//boolean flag = true;
		 volatile boolean flag = true;
		
		@Override
		public void run() {
			//flag = true;
			if(Thread.currentThread().getName().equals("Second")) {
				flag = false;
			}
			while (flag) {
				System.out.println(Thread.currentThread().getName() + ",Flag Value ::" + flag);
				//flag = false;
			}
		}
	}

}
