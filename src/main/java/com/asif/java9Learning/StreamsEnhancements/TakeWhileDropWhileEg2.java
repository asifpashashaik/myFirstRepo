package com.asif.java9Learning.StreamsEnhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhileDropWhileEg2 {

	//takeWhile vs filter
	//takeWhile() - execute till the condition is false..the moment its false it stop execution
	//filter - executes for all the elements
	//takeWhile and dropWhile are default methods present inside Stream interface
	

	//dropWhile() is opp of takeWhile() - filters all the false
	public static void main(String[] args) {
		
		/* takeWhile() Examples */
		System.out.println("/* takeWhile() Examples */");
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(2, 4, 1, 5, 6, 8));
		System.out.println("My Actual ArrayList: " + arrayList);
	
		
		//Eg:1 - filter for even number and Execute till finds the odd number
		List<Integer> collect = arrayList.stream().takeWhile(e->e%2==0).collect(Collectors.toList());
		System.out.println("takeWhile till it finds even numbers:" + collect); //after 4 it found odd num so execution ends
		
		//Eg:2 - filter for string lenght <=2 and excute till its false then stop executions
		ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("A", "AA", "BBB", "CCC", "CC", "C"));
		System.out.println("My Actual ArrayList: " + arrayList1);
		List<String> collect1 = arrayList1.stream().takeWhile(e->e.length()<=2).collect(Collectors.toList());
		System.out.println("takeWhile till it finds elemetn till finds len <=2 : " + collect1);
		
		//Eg:2A(Other way) - filter for string lenght <=2 and excute till its false then stop executions
		Stream.of("A", "AA", "BBB", "CCC", "CC", "C").takeWhile(e->e.length()<=2).forEach(System.out::println);
		
		/* dropWhile() Examples */
		System.out.println("__________________________________________________________________________________");
		System.out.println("/*dropWhile() Examples */");
		
		
		
		//Eg:1 - filter for even number and Execute till finds the odd number
		List<Integer> collect2 = arrayList.stream().dropWhile(e->e%2==0).collect(Collectors.toList());
		System.out.println("takeWhile till it finds even numbers:" + collect2); //after 4 it found odd num so execution ends
				
		//Eg:2 - filter for string lenght <=2 and excute till its false then stop executions
		ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("A", "AA", "BBB", "CCC", "CC", "C"));
		System.out.println("My Actual ArrayList: " + arrayList2);
		List<String> collect3 = arrayList1.stream().dropWhile(e->e.length()<=2).collect(Collectors.toList());
		System.out.println("takeWhile till it finds elemetn till finds len <=2 : " + collect3);
				
		//Eg:2A(Other way) - filter for string lenght <=2 and excute till its false then stop executions
		Stream.of("A", "AA", "BBB", "CCC", "CC", "C").dropWhile(e->e.length()<=2).forEach(System.out::println);
						
		
		
	}
	
}
