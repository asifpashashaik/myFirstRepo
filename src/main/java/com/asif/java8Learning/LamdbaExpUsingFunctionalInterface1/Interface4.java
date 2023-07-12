package com.asif.java8Learning.LamdbaExpUsingFunctionalInterface1;

@FunctionalInterface
public interface Interface4 {
	
	//Abstract method
	public void getSquareRoot(int a);

	//Default method - we can unlimited 
	public default void d1() {

	}

	//Static method - we can unlimited
	public static void s1() {

	}

}
