package com.asif.java9Learning.StreamsEnhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
class Address9 {
	private Integer dno;
	private String street;
	private String city;
}

@Data
@AllArgsConstructor
@ToString
class Department9 {
	private String depName;
	private String depLocation;
	private Integer depNumber;
}

@Data
@AllArgsConstructor
@ToString
class Employee9 {
	private Integer eno;
	private String ename;
	private List<Department9> department; //multiple department
	private Address9 address;
	
}


public class RemovingDuplicates {

	public static void main(String[] args) {
		List<Employee9> l1 = new ArrayList<>();
		l1.add(new Employee9(51, "Asif1", Arrays.asList( new Department9("DEP", "LOC",100), new Department9("DEP1", "LOC1",111) ), new Address9(1, "Stree1", "Hyderabad")));
		l1.add(new Employee9(52, "Asif2", Arrays.asList( new Department9("DEP", "LOC",100), new Department9("DEP2", "LOC2",222) ), new Address9(2, "Stree2", "Secundrabad")));
		l1.add(new Employee9(53, "Asif3", Arrays.asList( new Department9("DEP", "LOC",100), new Department9("DEP3", "LOC3",333) ), new Address9(1, "Stree3", "Vijayawada")));
		

		//To print all Address.dno
		l1.stream().mapToInt(e -> e.getAddress().getDno()).forEach(System.out::println);//1,2,1
		//To remove duplicates from Address.dno
		l1.stream().mapToInt(e -> e.getAddress().getDno()).distinct().forEach(System.out::println);  //1,2
		
		System.out.println("_______________________________________________________________________________________");
		
			
		//To remove duplicates from List<Department>.depNumber
		l1.stream().flatMap(e -> e.getDepartment().stream()).map(e->e.getDepNumber()).distinct().forEach(System.out::println);  //100,111,222,333
		l1.stream().flatMap(e -> e.getDepartment().stream()).mapToInt(e->e.getDepNumber()).distinct().forEach(System.out::println);  //100,111,222,333
		
		System.out.println("________________________________________________________________________________________");
		
		//Diffrence b/w map and mapToInt check return type
	   l1.stream().flatMap(e -> e.getDepartment().stream()).map(e->e.getDepNumber()).distinct();  //100,111,222,333
	 	OptionalDouble mapToDouble = l1.stream().flatMap(e -> e.getDepartment().stream()).mapToDouble(e->e.getDepNumber()).average(); //100,111,222,333
		//Note: to do any aggreate funcations like min, max, average, sum, converting mapToInt/mapToDouble is required
	 	
	 	
		//System.out.println(stremaOfInt);
		System.out.println(mapToDouble.getAsDouble());
		System.out.println("________________________________________________________________________________________");
		
		
	}

}
