package com.asif.java8Learning.LamdbaExpUsingFunctionalInterface1;

// refer BasicThreadExample class
// Lambas is best when compared with Annnoymous inner class only with Funcational Interfaces
public class ThreadUsingLamdaEg3 {

	public static void main(String[] args) {

		// Eg-a: Runnable Interface using Annonymous Inner Class
		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("Annonymous Inner Class: *****Child Thread******");
				}
			}

		};
		
		// Child Tread
				Thread t1 = new Thread(r1);
				t1.start();

		//--------------------------------------------------------------------------------------------------		
				
		
		// Eg-b:Runnable is Functional Interface using Lambdas it has one abstaract method run()
		Runnable r2 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Lambda1: *****Child Thread******");
			}
		};
		
		// Child Tread
		Thread t2 = new Thread(r2);
		t2.start();

		//--------------------------------------------------------------------------------------------------
		
		// Eg-C:Lambdas in a simple way
							
				Thread t3 = new Thread(() -> {
					                        for (int i = 0; i < 10; i++) {
					                     	System.out.println("Lambda Simply Way1: *****Child Thread******");
                  	                         }});	
				
				t3.start();
		
		// Main Thread

		for (int i = 0; i < 10; i++) {
			System.out.println("Lambda2: *****Main Thread******");
		}

		// Now we have 2 threads and executions is unexpected can execute in any order

	}

}
