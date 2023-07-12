package com.asif.java8Learning.Strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonocciSeries {

	public static void main(String[] args) {
		int n1=0, n2=1, n3;
		int num=10;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<num;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		

		System.out.println("______________________________________________________________");
		System.out.println("___________________USING STREAM              _________________________");
		Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]}) // lambda expression
        .limit(10)
        .map(n -> n[0])
        .forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
