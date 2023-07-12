package com.asif.java8Learning.PredicateFuncInterface4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class TCSEmployee {

	String name;
	String designation;
	double salary;
	String city;

	@Override
	public boolean equals(Object obj) {

		TCSEmployee e = (TCSEmployee) obj;
		if (name.equals(e.name) && designation.equals(e.designation) && salary == e.salary && city.equals(e.city)) {
			return true;
		} else {
			return false;
		}

	}
	
	//imp to print only two deciamals for float add %.2f
	@Override
	public String toString() {
		return String.format("[%s,%s,%.2f,%s]", name, designation, salary, city);
	}

	public TCSEmployee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

public class PredicateFuncInterface_UsingCollectionsEg3 {

	public static void main(String[] args) {

		List<TCSEmployee> TCSEmployeesList = new ArrayList<>();
		TCSEmployeesList.add(new TCSEmployee("Asif", "CEO", 30000, "Hyderabad"));
		TCSEmployeesList.add(new TCSEmployee("Sunny", "Manager", 20000, "Hyderabad"));
		TCSEmployeesList.add(new TCSEmployee("Mallika", "Manager", 20000, "Bangalore"));
		TCSEmployeesList.add(new TCSEmployee("Kareena", "Lead", 15000, "Hyderabad"));
		TCSEmployeesList.add(new TCSEmployee("Katrina", "Lead", 15000, "Bangalore"));
		TCSEmployeesList.add(new TCSEmployee("Anushka", "Developer", 10000, "Hyderabad"));
		TCSEmployeesList.add(new TCSEmployee("Kanushka", "Developer", 10000, "Hyderabad"));
		TCSEmployeesList.add(new TCSEmployee("Sowmya", "Developer", 10000, "Bangalore"));

		
		//Different Predicate Functions			
	  	 Predicate<TCSEmployee> p1=emp->emp.designation.equals("Manager");
		 System.out.println("->Managers Information:");
		 display(p1,TCSEmployeesList);
		 System.out.println("____________________________________________________________________________");
		
		 Predicate<TCSEmployee> p2=emp->emp.city.equals("Bangalore");
		 System.out.println("->Bangalore Employees Information:");
		 display(p2,TCSEmployeesList);
		 System.out.println("____________________________________________________________________________");
		 
		 Predicate<TCSEmployee> p3=emp->emp.salary<20000;
		 System.out.println("->Employees whose slaray <20000 To Give Increment:");
		 display(p3,TCSEmployeesList);
		 System.out.println("____________________________________________________________________________");
		 
		 
		 System.out.println("->All Managers from Bangalore city for Pink Slip:");
		 display(p1.and(p2),TCSEmployeesList);
		 System.out.println("____________________________________________________________________________");
		
		 System.out.println("->Employees Information who are either Managers or salary <20000");
		 display(p1.or(p3),TCSEmployeesList);
		 System.out.println("____________________________________________________________________________");
		
		 System.out.println("->All Employees Information who are not managers:");
		 display(p1.negate(),TCSEmployeesList);
		 System.out.println("____________________________________________________________________________");
		 
		 //To check/compare the Object
		 Predicate<TCSEmployee> isCEO=Predicate.isEqual(new TCSEmployee("Asif", "CEO", 30000, "Hyderabad"));
		
		 TCSEmployee e1=new TCSEmployee("Asif","CEO",30000,"Hyderabad");
		 TCSEmployee e2=new TCSEmployee("Sunny","Manager",20000,"Hyderabad");
		 System.out.println(isCEO.test(e1));//true ( for this to work override equals method)
		 System.out.println(isCEO.test(e2));//false 
		 System.out.println("____________________________________________________________________________");
		
	}
	
	// Display Method to print the Employees
	private static void display(Predicate<TCSEmployee> p, List<TCSEmployee> TCSEmployeesList) {
		for (TCSEmployee tCSEmployee : TCSEmployeesList) {
			if (p.test(tCSEmployee))
				System.out.println(tCSEmployee);

		}
	}
	
	
}
