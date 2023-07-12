
package com.asif.java8Learning.Strings;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SmallestIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size=5;
		Integer[] array = {1,3,4,78,23,2,5,6};
		Arrays.sort(array);
		
			if(array[0]<0) {
				System.out.println(iterateNegativeNumbers(array));
				
			}else {
				System.out.println(iteratePositiveNumbers(array));
				
			}
			
			
		//Using Streams	
		
		Integer maxInt = Stream.of(array).map(e->e).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum is (using Streams): "  + maxInt);
		
		
		Integer minInt = Stream.of(array).map(e->e).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum is (using Streams): "  + minInt);
	}

	private static int iterateNegativeNumbers(Integer[] array) {
		int n=0;
		for(int a:array) {
			if(n==a) {
				n--;
			}
		}
		return n;
		
	}

	private static int iteratePositiveNumbers(Integer[] array) {
		int n=1;
		for(int a:array) {
			if(n==a) {
				n++;
			}
		}
		return n;
	}
}
