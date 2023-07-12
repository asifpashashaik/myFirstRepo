package com.asif.java8Learning.LamdbaExpUsingFunctionalInterface1;

class myRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("*****Child Thread******");
		}

	}

}

public class BasicThreadExample {

	public static void main(String[] args) {

		// Child Tread
		Runnable r = new myRunnable();
		Thread t = new Thread(r);
		t.start();

		// Main Thread

		for (int i = 0; i < 10; i++) {
			System.out.println("*****Main Thread******");
		}

		// Now we have 2 threads and executions is unexpected can execute in any order

	}

}
