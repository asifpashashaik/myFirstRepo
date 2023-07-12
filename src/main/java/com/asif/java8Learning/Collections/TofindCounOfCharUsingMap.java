package com.asif.java8Learning.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TofindCounOfCharUsingMap {

	public static void main(String[] args) {

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		// Eg1
		String s = "Hello World";
		for (char c : s.toCharArray()) {
			System.out.println("Selected First Char :" + c);
			System.out.println("hashMap.get: " + hashMap.get(c));
			if (hashMap.get(c) != null) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}

		}

		System.out.println(hashMap);
		
		System.out.println("____________________________________________________");
		System.out.println("____________________Very Simple Way_____________________");
		
	
		

	}

}
