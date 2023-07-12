package com.asif.java9Learning.StreamsEnhancements;

import java.util.stream.Stream;

public class IterateLimitForEachEg3 {


	public static void main(String[] args) {
		
		System.out.println("Stream.iterate(2 arguments), Stream.iterate(3 arguments) Examples");
		//Stream.iterate() is a static method present inside Stream Interface
		//iterate() has two overridden methodes with 2 and 3 arguments
		
		//Eg1
		//Stream.iterate(1, x->x+1).forEach(System.out::println); //this will print 1 to unlimited
		Stream.iterate(1, x->x+1).limit(10).forEach(System.out::println); //this will print 1 to 10
		
		//Eg2 
		Stream.iterate(1, x->x+1).limit(10).forEach(System.out::println); //this will print 1 to 10
		
		//Eg3 To iterate based on condition with 3 arguments 
		//this is just like for(int i=1; i<=10, i++)
		Stream.iterate(1, x-> x<=10, x->x+1).forEach(System.out::println); //this will print 1 to 10
		
		
		System.out.println("______________________________________________________________________________");
		System.out.println("Stream.ofNullable() Examples");
		//
		//Eg4
		
		
	}

}
