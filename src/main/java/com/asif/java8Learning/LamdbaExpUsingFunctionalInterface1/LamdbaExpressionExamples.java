package com.asif.java8Learning.LamdbaExpUsingFunctionalInterface1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.asif.java8Learning.LamdbaExpUsingCollections2.MyComparator;

//lambda expression using Collections

public class LamdbaExpressionExamples {
	public static void main(String[] args) {

// Collection is used to represent group of objs in the single entity
		// List(I) (arrayList, LinkedList, Vector)- preserves order, allows duplicate
		// Set(I) (TreeSet,HashSet)- inseretion order not preserved, not duplicate
		// Map(I)

		//Example1 : Collections 
		//allows duplicates
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(2222);
		arrayList.add(4444);
		arrayList.add(1111);
		arrayList.add(5555);
		arrayList.add(3333);
		arrayList.add(1111);
		
		System.out.println("Before Sorting" + arrayList);
		Collections.sort(arrayList); //Default natural sorting in ascending
		System.out.println("After Sorting" + arrayList);
		
		
		//if you want customized sorting like descending order then use comparator
		Collections.sort(arrayList, new MyComparator()); //Default natural sorting in ascending
		System.out.println("After Customized Sorting using comparator in Desc order" + arrayList);
		
		
		// Using Lambda Expressions
  		
		
		Collections.sort(arrayList, (o1,o2)->(o1>o2)?-1:(o1<o2)?+1:0);
		System.out.println("Comparator using Lambda exp" + arrayList);
		System.out.println("_____________________________________________________________________________________________________________");

		//no duplicates
		Set<String> hs = new TreeSet<String>();
		hs.add("CCCC");
		hs.add("BBBB");
		hs.add("AAAA");
		hs.add("AAAA");
		System.out.println("TreeSet ASC SORTING Output:" + hs); //default sorting order
		
		//no duplicates
				TreeSet<Integer> ts1 = new TreeSet<Integer>((i1,i2) -> (i1>i2)?-1:(i1<i2)?+1:0);
				ts1.add(22222);
				ts1.add(11111);
				ts1.add(33333);
				ts1.add(55555);
				System.out.println("TreeSet DSC SORTING Output Using lambda:" + ts1); //Custom sorting order
		System.out.println("_____________________________________________________________________________________________________________");

		//no duplicates
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"Vijayawada" );
		hm.put(2,"Hyd");
		hm.put(4, "Chennai");
		hm.put(3, "Capital");
		hm.put(5, "Mumbai");
		System.out.println(hm);
		
	//same as TreeSet, if you dont provide anything then its default sorting
	//for CUstom sorring privide lamdab comprator impl	
		Map<Integer, String> tm1 = new TreeMap<Integer, String>((i1,i2) -> (i1>i2)?-1:(i1<i2)?+1:0);
		tm1.put(1,"Vijayawada" );
		tm1.put(2,"Hyd");
		tm1.put(4, "Chennai");
		tm1.put(3, "Capital");
		tm1.put(5, "Mumbai");
		System.out.println("After Custom Sorting DESC :"+tm1);
		System.out.println("_____________________________________________________________________________________________________________");
		
		// Example2: Comparator
		//Comparator Funcational Interface it has one abstract method compare()
		//Comparator is used for sorting the objects in collection
		
		//used for sorting by comparing the two objects, return of compare() is int
		
		/* For asending order 
		 * if obj1 has to come before obj2, then return negative value 
		 * if obj1 has to come after obj2, then return positive value 
		 * if obj1 is equal to obj2, then return 0
		 */
		
		////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
	}
}
