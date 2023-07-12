package com.asif.java8Learning.Streams6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_UsingSorted_Eg4 {

	public static void main(String[] args) {

		Integer array[] = {10, 1, 3, 9, 2, 5, 7, 6, 4, 8};
		 System.out.println("Array Prservers Order: " + Arrays.toString(array)); 
		 System.out.println("________________________________________________________________");
		 
		 //Default ASC Order
		 //Stream<Integer> s = Stream.of(array);
	     List<Integer> collect = Arrays.stream(array).sorted().collect(Collectors.toList());
		 System.out.println("ASC Order : " + collect);
		 System.out.println("________________________________________________________________");
		 
		 //Customized DSC Order using sorted(Comparator c)
		 List<Integer> collect2 = Arrays.stream(array).sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
		 System.out.println("DSC Order : " + collect2);
		 System.out.println("________________________________________________________________");
		}	
	

}
