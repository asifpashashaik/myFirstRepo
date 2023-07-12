package com.asif.java8Learning.Streams6;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream_UsingStremOf_Eg6 {

	public static void main(String[] args) {

	//Group of values
	Stream<Integer> s = Stream.of(9,99,999,9999,9999);
	s.forEach(System.out::println);
		
    Integer array[] = {10, 1, 3, 9, 2, 5, 7, 6, 4, 8};
    Stream<Integer> s1 = Stream.of(array);
    s1.forEach(System.out::println);
    
    //Another way for Arrays
    Arrays.stream(array).forEach(System.out::println);
	System.out.println("________________________________________________________________");
	 
	 
	}

}
