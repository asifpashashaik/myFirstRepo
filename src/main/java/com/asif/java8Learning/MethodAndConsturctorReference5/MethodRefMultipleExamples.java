package com.asif.java8Learning.MethodAndConsturctorReference5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class MethodRefMultipleExamples {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(null, 1, 2, 3, null, 7, null);

		
		//Eg1
		numbers.stream().forEach(System.out::println);
		
		//Eg2 in Filters
		      numbers
                .stream()
                .filter(Objects::nonNull)  //null filter
                .map(m->m)
                .forEach(System.out::println);
		
		//Eg3
		numbers
        .stream()
        .filter(Objects::nonNull)
        .sorted(Integer::compareTo)//Comparator method
        .forEach(System.out::println);  
		
		
		//eg4
		 System.out.println(Stream.of("H", "T", "D", "I", "J")
		            .min(Comparator.comparing(String::valueOf))
		            .get());
		
	}
}
