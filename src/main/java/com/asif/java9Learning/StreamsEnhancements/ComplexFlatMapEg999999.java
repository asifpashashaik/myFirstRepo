package com.asif.java9Learning.StreamsEnhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
class Address {
	private Integer dno;
	private String street;
	private String city;
}

@Data
@AllArgsConstructor
@ToString
class Department {
	private String depName;
	private String depLocation;
}

@Data
@AllArgsConstructor
@ToString
class Employee1 {
	private Integer eno;
	private String ename;
	private List<Department> department; //multiple department
	private Address address;
	
}

public class ComplexFlatMapEg999999 {

	public static void main(String[] args) {

		
	//With map() you can achieve one to one mapping ie. for each element, some operation is performed and a element is added
	//With flatMap() we can achieve one to any no of mapping
		//empty() can achieve zero elements
		//Stream.of() we can achieve multiple elements
		
		List<Employee1> l1 = new ArrayList<>();
		l1.add(new Employee1(51, "Asif1", Arrays.asList( new Department("DEP", "LOC"), new Department("DEP1", "LOC1") ), new Address(1, "Stree1", "Hyderabad")));
		l1.add(new Employee1(52, "Asif2", Arrays.asList( new Department("DEP", "LOC"), new Department("DEP2", "LOC2") ), new Address(2, "Stree2", "Secundrabad")));
		l1.add(new Employee1(53, "Asif3", Arrays.asList( new Department("DEP", "LOC"), new Department("DEP3", "LOC3") ), new Address(3, "Stree3", "Vijayawada")));
		//l1.add(new Employee1(54, "Asif4", Arrays.asList( new Department("DEP", "LOC"), new Department("DEP4", "LOC4") ), new Address(4, "Stree4", "Hyderabad")));
		//l1.add(new Employee1(55, "Asif5", Arrays.asList( new Department("DEP", "LOC"), new Department("DEP5", "LOC5") ), new Address(5, "Stree5", "Chennai")));
				
		List<Employee1> collect1 = l1.stream().filter(emp-> emp.getEno()%2==0).collect(Collectors.toList());
		List<Integer> collect2 = l1.stream().map(emp->emp.getEno()).collect(Collectors.toList());
		List<Address> collect3 = l1.stream().map(emp->emp.getAddress()).collect(Collectors.toList());
		
		Set<List<Department>> collect4 = l1.stream().map(emp->emp.getDepartment()).collect(Collectors.toSet());
		Set<Department> collect5 = l1.stream().flatMap(emp->emp.getDepartment().stream()).collect(Collectors.toSet());
		
		Set<String> collect6 = l1.stream().flatMap(emp->emp.getDepartment().stream()).map(Department::getDepName).sorted().collect(Collectors.toSet());
		
		
		//If we apply on map() on list of getDepartments is not correct, it should be always flatMap() on the List(here Department is List)
		/* Also check check return Type and msword example with diagram
		 * Stream<Department> flatMap =   l1.stream().flatMap(emp->emp.getDepartment().stream());
		 * Stream<List<Department>> map = l1.stream().map(emp->emp.getDepartment());
		 */
		
		System.out.println(collect1);
		System.out.println(collect2);
		System.out.println(collect3);
		System.out.println("_________________________________________________________");
		System.out.println(collect4);
		System.out.println("_________________________________________________________");
		System.out.println(collect5);
		System.out.println("_________________________________________________________");
		System.out.println(collect6);
		System.out.println("_________________________________________________________");
		
		
		
		//Simple Example
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(numbers);
		List<Integer> twoEvenSquares = 
		    numbers.stream()
		           .filter(n -> {
		                    System.out.println("filtering " + n); 
		                    return n % 2 == 0;
		                  })
		           .map(n -> {
		                    System.out.println("mapping " + n);
		                    return n * n;
		                  })
		           .limit(2)
		           .collect(Collectors.toList());
		System.out.println(twoEvenSquares);
	
		
		//Notes:
		//flatMap() is used to further more operation top of Map...like to convert into Stream
	      //flatMap apply on List
		
		//toSet() removes duplicates
		
		/*Notes
		 * Merge lists Another case when flatMap() can be very useful is when we would
		 * like to combine two or more lists (or any other java.util.Collection).
		 */
//	       List<String> mergeLists(List<String> left, List<String> right) {
//		      return Stream.of(left, right)
//			    .flatMap(List::stream)
//			    .toList();
//			}
	
		/*
		 * Notes:Author has Books List (Unwrap & operate)
		 * After converting a list of Author objects into a
		 * stream the flatMap() operation is used first. The books() method is invoked
		 * to get their list and then it's changed into the stream. The flatMap() is
		 * then merging all resulting streams into one so next the title() can be called
		 * to get a String representation of a book title. Finally, the results of each
		 * element in a stream are collected into the list. */
///	       List<String> getAllBookTitles(List<Author> authors) {
//		     return authors.stream()
//		      .flatMap(author -> author.books().stream())
//		      .map(Book::title)
//		      .toList();
//		      }
	
	
	
	}
}
