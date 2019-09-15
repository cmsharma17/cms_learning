package com.cms.multithreading;

public class ThreadDeadLockExample {
	public static void main(String args[]) {
		ThreadDeadLockExample test = new ThreadDeadLockExample();
		final A a = test.new A();
		final B b = test.new B();
		
		// Thread-1
		Runnable block1 = new Runnable() {
			@Override
			public void run() {
				synchronized(a) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(b) {
						System.out.println("In Block 1");
					}
				}
			}
		};
		
		// Thread-2
		Runnable block2 = new Runnable() {
			@Override
			public void run() {
				synchronized(b) {
					// Thread-2 have B but need A also
					synchronized(a) {
						System.out.println("In Block 2");
					}
				}
			}
		};
		
		new Thread(block1).start();
		new Thread(block2).start();
	}
	private class A{
		int a = 20;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
		
	}
	
	private class B{
		int b = 30;

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
		
	}
	
}
