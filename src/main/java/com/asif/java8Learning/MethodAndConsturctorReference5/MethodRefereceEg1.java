package com.asif.java8Learning.MethodAndConsturctorReference5;

@FunctionalInterface
interface Interf {
	public void m1();
}

public class MethodRefereceEg1 {

	public static void m2() {
		System.out.println("M2 Static Method Reference");
	}
	
	
	public  void m9() {
		System.out.println("M1 Instance Method Reference");
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

		// *Using Method Reference its alternative to Lambda Expression
		
		Interf i3 = MethodRefereceEg1::m2;
		i3.m1();
		MethodRefereceEg1 methodRefereceEg1 = new MethodRefereceEg1();
		Interf i4 = methodRefereceEg1::m9;
		i4.m1();

	}

}
