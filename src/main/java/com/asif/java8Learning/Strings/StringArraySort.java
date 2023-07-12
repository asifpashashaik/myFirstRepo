package com.asif.java8Learning.Strings;
import java.util.Arrays;
import java.util.Comparator;

public class StringArraySort {

	public static void main(String[] args) {
		
		
		String[] str= {"mounika", "asif", "dge","da"};
		
		System.out.println("______________________________BEFORE SORTING______________________________________");
		
		//Before Sorting
		for(String s:str) {
			System.out.println(s);
		}
		
		System.out.println("______________________________AFTER SORTING______________________________________");
		
		//After Sorting
		Arrays.sort(str);
		for(String s:str) {
			System.out.println(s);
		}
		
		System.out.println("__________________________Search String using forEach enahnced for loop_________________________________________");
		
		
		// to search for particular string
		for(String s:str) {
			if(s.equals("da")) {
				System.out.println("found string: 'da'");
				break;
			}
		}
		
		System.out.println("__________________________Other way to search String in array using binarySearch__________________________");
		
		int binarySearch = Arrays.binarySearch(str, "da");
		if (binarySearch > 0) {
			System.out.println("Found string: 'da'");
		} else 
		{
			System.out.println("String 'da' not found");
		}
	
	}

}
