package com.asif.java9Learning.StreamsEnhancements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class SimpleFlatMapEg1 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			arrayList.add(i);
		}
		System.out.println("My Acutal ArrayList : " + arrayList);
		
		//Eg1 - return element and squareroot of element ie. multilpe values so go for flatMap()
		List<Integer> collect = arrayList.stream().flatMap(e -> Stream.of(e, e*e)).collect(Collectors.toList());
		System.out.println("Element & SqreRoot of each Element is : " + collect);
	
		//Note:This is wrong we cant convert using map "cannot convert from List<Stream<Integer>> to List<Integer>"
		//List<Integer> collect = arrayList.stream().map(e -> Stream.of(e*e)).collect(Collectors.toList());
		
		
		//Eg2 - if odd num return empty else add even num to Stream.of()
		List<Integer> collect1 = arrayList.stream().flatMap(e -> {
			if (e % 2 == 0) {
				return Stream.of(e);
			} else {
				return Stream.empty();
			}
		}).collect(Collectors.toList());
		System.out.println("Even Number are : " + collect1);
		
		//Eg3 - if odd num return empty else add element and its squareRoot to Stream.of()
		List<Integer> collect2 = arrayList.stream().flatMap(e -> {
			if (e % 2 == 0) {
				return Stream.of(e,e*e);
			} else {
				return Stream.empty();
			}
		}).collect(Collectors.toList());
		System.out.println("Even Number and its square root are : " + collect2);
		
	}
}

