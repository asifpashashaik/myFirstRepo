package com.asif.java9Learning.StreamsEnhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
class Address8 {
	private Integer dno;
	private String street;
	private String city;
}

@Data
@AllArgsConstructor
@ToString
class Department8 {
	private String depName;
	private String depLocation;
	private Integer depNumber;
}

@Data
@AllArgsConstructor
@ToString
class Employee8 {
	private Integer eno;
	private String ename;
	private Address8 address; //Address Object
	private List<Department8> department; //List of Objects i.e. department
	
}


public class FindingDuplicates {

	//**Address is object, Department is List of Objects**
	public static void main(String[] args) {
		List<Employee8> l1 = new ArrayList<>();
		l1.add(new Employee8(51, "Asif1", new Address8(11, "Stree1", "Hyd"), Arrays.asList( new Department8("DEP", "LOC0",100), new Department8("DEP1", "LOC1",111) )));
		l1.add(new Employee8(52, "Asif2", new Address8(22, "Stree2", "Sec"), Arrays.asList( new Department8("DEP", "LOC0",100), new Department8("DEP2", "LOC2",222) )));
		l1.add(new Employee8(53, "Asif3", new Address8(11, "Stree3", "Vij"), Arrays.asList( new Department8("DEP", "LOC0",100), new Department8("DEP3", "LOC3",333) )));
		

		//Simple example to Remove Duplicate from simple Array List
		List<Integer> asList = Arrays.asList(1,1,1,2,2,3,4,5,6,7,8,9,10,10);
		HashSet<Integer> hashSet = new HashSet<Integer>();
		List<Integer> listDuplicate_AddrDno = asList.stream().filter(e->!hashSet.add(e)).collect(Collectors.toList());
		System.out.println("All List:" + hashSet);//Note this return all
		System.out.println("Duplicates are :" + listDuplicate_AddrDno);//this displys only duplicate
		System.out.println("_______________________________________________________________________________________");
		
		//RealTime Eg: To print all Address.dno
		l1.stream().mapToInt(e -> e.getAddress().getDno()).forEach(System.out::println);//1,2,1
		//RealTime Eg:To print only duplicates from Address.dno
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
        List<Integer> addressDnoList = l1.stream().map(e->e.getAddress().getDno()).collect(Collectors.toList());
        Set<Integer> onlyDuplicateAddrDnos = addressDnoList.stream().filter(e->!hashSet1.add(e)).collect(Collectors.toSet());
		System.out.println("List of Addr Dno are:" + addressDnoList);//Note this return all
		System.out.println("Duplicates of Addr Dno are:" + onlyDuplicateAddrDnos);//this displays only duplicate
		System.out.println("_______________________________________________________________________________________");
		
			
		//Realtime eg: To display only duplicates from List<Department>.depNumber
		List<Integer> listOfDepNumbers = l1.stream().flatMap(e->e.getDepartment().stream()).map(Department8::getDepNumber).collect(Collectors.toList());
		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		Set<Integer> onlyDuplicateDepNumbers = listOfDepNumbers.stream().filter(e->!hashSet2.add(e)).collect(Collectors.toSet());
		System.out.println("All Dept Numbers are: " + listOfDepNumbers);
		System.out.println("Only Duplcate Dept Numbers are: " + onlyDuplicateDepNumbers);
		
		
		System.out.println("________________________________________________________________________________________");
	
	}

}
