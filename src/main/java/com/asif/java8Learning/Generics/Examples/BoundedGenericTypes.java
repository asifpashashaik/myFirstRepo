package com.asif.java8Learning.Generics.Examples;

class Person implements Comparable<Person> {
	private int age;
	private String name;

	
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Person otherPerson) {
		// TODO Auto-generated method stub
		return Integer.compare(age, otherPerson.getAge());
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	
}

public class BoundedGenericTypes {

	// if we want to operate on Numbers like integer,floats or double i.e accpets
	// instance of Number Class or its subclasses
	// Number is bounded type parameter
	// we can use Bounded Generic Types with <T extends to Comprabale or Number
	// multiple Bounded <T extends B1 & B2 & B3>

	public static <T extends Comparable<T>> T calculateMin(T t1, T t2) {
		if (t1.compareTo(t2) < 0)
			return t1;
		return t2;

	}

	public static void main(String[] args) {
		System.out.println(calculateMin(10, 20)); // min is 10
		System.out.println(calculateMin('f', 'a')); // min is a
		System.out.println(calculateMin("Kevin", "Anna")); // min is Anna

		System.out.println(calculateMin(new Person(9,"Asif"), new Person(7, "Ariff"))); // min is a

	}

}
