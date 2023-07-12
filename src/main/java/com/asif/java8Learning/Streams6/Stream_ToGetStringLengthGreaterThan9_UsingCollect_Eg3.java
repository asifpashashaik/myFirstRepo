package com.asif.java8Learning.Streams6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_ToGetStringLengthGreaterThan9_UsingCollect_Eg3 {

	public static void main(String[] args) {

		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Pavan");
		arrayList.add("RaviTeja");
		arrayList.add("Chiranjeevi");
		arrayList.add("Venkatesh");
		arrayList.add("Nagarjuna");
		
		System.out.println("ArrayList Prservers Order: " + arrayList); //o/p - [0, 10, 20, 5, 15, 25]
		
		
		//Usually to print String who's lenght > 9 ... we use below logic until Java 1.7V
		List<String> newArrayList = new ArrayList<>();
		for (String i : arrayList) {
			if(i.length() >= 9 )
			newArrayList.add(i);
		}
		System.out.println("List of Strings with length > 9: " + newArrayList); 
		System.out.println("________________________________________________________________");
		
		//Same logic  with Stream Concept (Filter)
		List<String> collect = arrayList.stream().filter(i-> i.length()>=9).collect(Collectors.toList());
		System.out.println("List of Strings with length > 9 using Stream: " + collect);
		System.out.println("________________________________________________________________");
		
		//To Get String in UpperCase (Using Map)
		List<String> collect1 = collect.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("To print List to UpperCase using Stream: " + collect1);
		System.out.println("________________________________________________________________");
		
		
		//To Get Count of Strings who's length is >= 9 (Using Count)
		 long count = arrayList.stream().filter(i-> i.length()>=9).count();
		System.out.println("To print Count of String who's lenght >=9 using Stream: " + count);
		System.out.println("________________________________________________________________");
	}

}
