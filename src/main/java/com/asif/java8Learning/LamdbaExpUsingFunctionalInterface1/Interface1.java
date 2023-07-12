package com.asif.java8Learning.LamdbaExpUsingFunctionalInterface1;

@FunctionalInterface
public interface Interface1 {
	
	//Abstract method
	public void m1();

	//Default method - we can unlimited 
	public default void d1() {

	}

	//Static method - we can unlimited
	public static void s1() {

	}

}
