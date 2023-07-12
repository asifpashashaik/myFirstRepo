package com.asif.java8Learning.LamdbaExpUsingFunctionalInterface1;

@FunctionalInterface
public interface Interface2 {
	
	//Abstract method
	public void add(int a, int b);

	//Default method - we can unlimited 
	public default void d1() {

	}

	//Static method - we can unlimited
	public static void s1() {

	}

}
