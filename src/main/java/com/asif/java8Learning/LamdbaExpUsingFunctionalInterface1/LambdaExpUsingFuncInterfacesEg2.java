package com.asif.java8Learning.LamdbaExpUsingFunctionalInterface1;

//lambda expression using Function Interface
//no need to implement Interface and override the method using lambda
public class LambdaExpUsingFuncInterfacesEg2 {
	public static void main(String[] args) {

		// Eg1
		Interface1 i1 = () -> System.out.println("Hello World!");
		i1.m1(); // Hello World!

		// Eg2
		Interface2 i2 = (a, b) -> System.out.println("Sum of two values is :" + (a + b));
		i2.add(2, 3);
		i2.add(100, 300);

		// Eg3
		Interface3 i3 = a -> {return a.length();}; // return is optional
		System.out.println("Lenght of give String is :" + i3.getLength("123456789"));
		
		// Eg4
		Interface4 i4 = a -> System.out.println("Square Root of " + a + " is :" + (a*a));
		i4.getSquareRoot(10);

		/*
		 * Examples of Functional Interfaces are 
		 *    Runnable has run() abstaract method
		 *    Comparator has compare() 
		 *    Comparable has compareTo()
		 */
		
	}
}
