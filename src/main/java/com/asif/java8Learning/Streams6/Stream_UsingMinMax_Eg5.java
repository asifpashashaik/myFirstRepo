package com.asif.java8Learning.Streams6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Stream_UsingMinMax_Eg5 {

	public static void main(String[] args) {

		
		 Integer array[] = {10, 1, 3, 9, 2, 5, 7, 6, 4, 8};
		 System.out.println("Array Prsserved Order: " + Arrays.toString(array)); 
		 System.out.println("________________________________________________________________");
		 
		 //Default ASC Order
	     Integer integer = Arrays.stream(array).min((i1,i2)-> i1.compareTo(i2)).get();
		 System.out.println("Min Value : " + integer);
		 System.out.println("________________________________________________________________");
		 
		 //Customized DSC Order using sorted(Comparator c)
		  Integer integer1 = Arrays.stream(array).max((i1,i2)-> i1.compareTo(i2)).get();
		 System.out.println("Max Value : " + integer1);
		 System.out.println("________________________________________________________________");
		 
		 
		 
		// Get Min or Max Number
		 System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
		           .max(Comparator.comparing(Integer::valueOf))
		           .get());
		  
		 System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
		           .min(Comparator.comparing(Integer::valueOf))
		           .get());
		// Get Min or Max String/Char
		 System.out.println(Stream.of("H", "T", "D", "I", "J")
		            .max(Comparator.comparing(String::valueOf)) //other way
		            .get());
		 System.out.println(Stream.of("H", "T", "D", "I", "J")
		            .min(Comparator.comparing(String::valueOf))
		            .get());
		 
		 
		 System.out.println("________________________________________________________________");
		 
		 
		 //forEach() using Lambda Expression.
		 Arrays.stream(array).forEach(i->System.out.println(i));
		 //forEach using Method Reference
		 Arrays.stream(array).forEach(System.out::println);
		}
		

}
