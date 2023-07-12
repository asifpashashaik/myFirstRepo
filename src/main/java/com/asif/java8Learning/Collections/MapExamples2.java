package com.asif.java8Learning.Collections;

import java.util.HashMap;

public class MapExamples2 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("Asif1", 1);
		hashMap.put("Asif2", 2);
		hashMap.put("Asif3", 3);
		
		//Observe below two outputs
        System.out.println(hashMap.containsKey("Asif")); // here u r searching perf key
		hashMap.keySet().stream().filter(k->k.contains("Asif")).forEach(System.out::println);//this is partial key
	
		
//       o/p
//		false
		
//		Asif2
//		Asif1
//		Asif3

		
	}

}
