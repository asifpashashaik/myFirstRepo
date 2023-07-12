package com.asif.java8Learning.LamdbaExpUsingFunctionalInterface1;

@FunctionalInterface
public interface Interface3 {
	
	//Abstract method
	public int getLength(String a);

	//Default method - we can unlimited 
	public default void d1() {

	}

	//Static method - we can unlimited
	public static void s1() {

	}

}
