package com.asif.java8Learning.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapBasicExamples {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("Asif1", 1);
		hashMap.put("Asif2", 2);
		hashMap.put("Asif3", 3);
		
		//keySet() --- returns key in Set and 
		Set<String> keySet = hashMap.keySet();
		System.out.println( "keySet() :" + keySet);
		
		//Values() ----returns values in a Collection
		Collection<Integer> values = hashMap.values();
		System.out.println("values() : " +values);
		
		//entrySet - method returns the set of key-value mappings.
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		System.out.println("entrySet() : " + entrySet);
		
		
		
		
		System.out.println("________________________HASH MAP METHODS EXAMPLES_______________________________________");
		
		//get(Object key) example: hashMap.get("Asif")
		System.out.println("get() takes key and returns value: " + hashMap.get("Asif1"));
		System.out.println("hashMap.containsKey(\"Asif1\") : " + hashMap.containsKey("Asif1"));
		System.out.println("hashMap.containsValue(1) : " + hashMap.containsValue(1));
        hashMap.keySet().forEach(System.out::println);
        hashMap.values().forEach(System.out::println);
		System.out.println("hashMap.size() :" +  hashMap.size());
		System.out.println("hashMap.replace(\"Asif1\", 0) :" + hashMap.replace("Asif1", 100)); //replaces key
		System.out.println("hashMap.put(\"Asif4\", 4) :" + hashMap.put("Asif4", 4)); //dosnt return
		System.out.println("hashMap.remove(\"Asif3\") :" + hashMap.remove("Asif3"));
		System.out.println("hashMap.remove(\"Asif4\", 4) : " +hashMap.remove("Asif4", 4));
		
		System.out.println("Current hashMap :" + hashMap);
		

	}

}
