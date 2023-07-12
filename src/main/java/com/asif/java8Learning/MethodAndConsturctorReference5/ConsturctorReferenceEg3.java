package com.asif.java8Learning.MethodAndConsturctorReference5;

interface interf1{
	
	//Here return type is a Object
	public ConsturctorReferenceEg3 m1();
}

public class ConsturctorReferenceEg3 {

	//Constructor
	public ConsturctorReferenceEg3() {
		System.out.println("Consturctor Reference");
	}

	public static void main(String[] args) {
		// Using Unanimous Inner Class
		Interf i1 = new Interf() {

			@Override
			public void m1() {
				System.out.println("M1 Overriden method - Using Unanimous Inner Class ");
			}
		};
		i1.m1();

		// Using Lambda Expression
		Interf i2 = () -> System.out.println("M1 Overriden method - Using Lambda Expression");
		i2.m1();

		// *Using Constructor Reference its alternative to Lambda Expression
		Interf i3 = ConsturctorReferenceEg3::new;
		i3.m1();

	}

}
