package com.asif.java8Learning.Streams6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_ToDoubleValues_UsingFilter_Eg2 {

	public static void main(String[] args) {

		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(0);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(5);
		arrayList.add(15);
		arrayList.add(25);
		
		System.out.println("ArrayList Prservers Order: " + arrayList); //o/p - [0, 10, 20, 5, 15, 25]
		
		
		//Usually to print double the numbers... we use below logic until Java 1.7V
		List<Integer> newArrayList = new ArrayList<>();
		for (Integer i : arrayList) {
			newArrayList.add(i*2);
		}
		System.out.println("List of Doubled Numbers: " + newArrayList); //  [0, 10, 20]
		System.out.println("________________________________________________________________");
		
		//Same logic  with Stream Concept
		List<Integer> collect = arrayList.stream().map(i-> i*2).collect(Collectors.toList());
		System.out.println("List of Doubled Numbers using Stream: " + collect);
		System.out.println("________________________________________________________________");
	}


}
