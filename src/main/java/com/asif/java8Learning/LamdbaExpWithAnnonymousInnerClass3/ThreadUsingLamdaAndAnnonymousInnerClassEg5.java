package com.asif.java8Learning.LamdbaExpWithAnnonymousInnerClass3;

// refer BasicThreadExample class
public class ThreadUsingLamdaAndAnnonymousInnerClassEg5 {

	public static void main(String[] args) {

		//Runnable is Functional Interface it has one abstaract method run()
		
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Lambda: *****Child Thread******");
			}
		};
		
		// Child Tread
		Thread t = new Thread(r);
		t.start();

		// Main Thread

		for (int i = 0; i < 10; i++) {
			System.out.println("Lambda: *****Main Thread******");
		}

		// Now we have 2 threads and executions is unexpected can execute in any order

	}

}
