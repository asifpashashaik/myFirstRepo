package com.asif.java8Learning.LamdbaExpUsingCollections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//To respresent the group of objects in a single entity we use Collections

/*Collecitons Notes
List(I) (ArrayList, LinkedList,Vector) - preservers insertions order, allows duplicates
Set(I) (HashSet, TreeSet) - dosnt allow duplicates
Map(I) (HashMap, TreeMap) - dosnt allow duplicates

*
*/


public class LamdbaExpressionsUsingCollectionsEg4 {
	public static void main(String[] args) {

		//Eg1 using ArrayList
		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(33333);
		arrayList1.add(22222);
		arrayList1.add(55555);
		arrayList1.add(11111);
		arrayList1.add(44444);
		System.out.println("arrayList order :" + arrayList1);
		
	 	Collections.sort(arrayList1);
		System.out.println("Default ASC Sorting arrayList order :" + arrayList1);
		
		//Custom Sorting using comparator (refer MyComprator Class)
		Collections.sort(arrayList1, new MyComparator());
		System.out.println("Custom DSC Sorting arrayList order :" + arrayList1);
		
		//Using Comparator using Lambda expression
		Collections.sort(arrayList1, (o1,o2) -> (o1>o2)?-1:(o1<o2)?+1:0 );
		System.out.println("Lamdba Custom DSC Sorting arrayList order :" + arrayList1);
		
		System.out.println("_____________________________________________________________________________________________________________________________");
		
		//Eg2 Using TreeSet (for sorting)
		
		Set<Integer> ts= new TreeSet<Integer>();
		ts.add(33333);
		ts.add(22222);
		ts.add(55555);
		ts.add(11111);
		ts.add(44444);
		 System.out.println("Default TreeSet order :" + ts); //by default uses comprator
			
	    TreeSet<Integer> ts1 = new TreeSet<Integer>((o1,o2) -> (o1>o2)?-1:(o1<o2)?+1:0);
	    ts1.add(33333);
		ts1.add(22222);
		ts1.add(55555);
		ts1.add(11111);
		ts1.add(44444);
	    System.out.println("Lamdab Comparator sorting: "+ ts1);
		
		
	    System.out.println("_____________________________________________________________________________________________________________________________");
		
		//Eg3 Using TreeMap (for sorting)
	    TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "33333");
		tm.put(2, "22222");
		tm.put(5,"55555");
		tm.put(1, "11111");
		tm.put(4, "44444");
	    System.out.println("Default TreeSet order :" + tm); //by default uses comprator
			
	    TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>((o1,o2) -> (o1>o2)?-1:(o1<o2)?+1:0);
		tm1.put(3, "33333");
		tm1.put(2, "22222");
		tm1.put(5,"55555");
		tm1.put(1, "11111");
		tm1.put(4, "44444");
	    
	    System.out.println("Lamdab Comparator sorting: "+ tm1);
		
		
	    System.out.println("_____________________________________________________________________________________________________________________________");
		
	    
	    
	    
	//-----------------------------------------------------------------------------
		
		
		//Using Collection Object
		
		List<EmployeeDto> al1 = new ArrayList<EmployeeDto>();
		al1.add(new EmployeeDto(2, "Two"));
		al1.add(new EmployeeDto(3, "Three"));
		al1.add(new EmployeeDto(4, "Four"));
		al1.add(new EmployeeDto(5, "Five"));
		al1.add(new EmployeeDto(1, "One"));
		
		System.out.println("Insertion Order :"+ al1); //It preservers insertion order
		
		Collections.sort(al1, (e1, e2)-> (e1.getSNo()<e2.getSNo())?-1:(e1.getSNo()>e2.getSNo())?+1:0);
		System.out.println("Custom Sorting ASC :"+al1); //Custom sorting ASC order
		
		Collections.sort(al1, (e1, e2)-> (e1.getSNo()>e2.getSNo())?-1:(e1.getSNo()<e2.getSNo())?+1:0);
		System.out.println("Custom Sorting ASC :"+al1); //Custom sorting DSC order
		
		
		
		//Notes
		
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
		
		
		
		
		System.out.println("_____________________________________________________________________________________________________________________________");
	}
}
