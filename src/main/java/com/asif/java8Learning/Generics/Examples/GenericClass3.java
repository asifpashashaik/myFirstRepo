package com.asif.java8Learning.Generics.Examples;

import java.util.ArrayList;

import lombok.extern.java.Log;


//Generic with Interface Example 2
//here we have generic - interface, class, method and filed

@Log
public class GenericClass3  {

	//1 **Making only method generic, not class** 
	//if generic method then we should have <T> (imp)
 	public <T> T dataMethod(T data) {
		return data;
	}

 	//2 Collection
 	public <T> void collectionMethod(ArrayList<T> arrayList, T e) { 
 		arrayList.add(e); 		
 		System.out.println(arrayList);
 	}
 	
 	//3 Two generic types
 	public <T,V> void someMethod(T t, V v) {
 		log.info("Entered Key is :" + t + ", and Key data type is :" + t.getClass().getSimpleName());
 		log.info("Entered Value is :" + v + ", and Key data type is :" + v.getClass().getSimpleName());
 	}
 	
 	
 	//4 Arrays
 	
 	public <T> void someArray(T[] t) {
 		System.out.println("Entered data is :" + t + ", and data type is :" + t.getClass().getSimpleName());
 	}
 	
	public static void main(String[] args) {

		//Eg1
		GenericClass3 o1 = new GenericClass3();
		log.info("Entered data is :" + o1.dataMethod("String") + ", and data type is :" + o1.dataMethod("String").getClass().getSimpleName());
		log.info("Entered data is :" + o1.dataMethod(10)       + ", and data type is :" + o1.dataMethod(10).getClass().getSimpleName());
		log.info("Entered data is :" + o1.dataMethod(10.11)    + ", and data type is :" + o1.dataMethod(10.11).getClass().getSimpleName());
		
		//Eg2 Collection
		ArrayList<String> arrayList1 = new ArrayList<String>();
		o1.collectionMethod(arrayList1, "String1");
				
		o1.collectionMethod(new ArrayList<Integer>(), 10);
		
		//Eg3 multiple generics
		o1.someMethod("String1", 10);

		//Eg4 Arrays
		String[] s = {"a", "ab", "abc"};
		Integer[] n = {1,22,333};
		o1.someArray(s);
		o1.someArray(n);
		
	}

}
