package com.asif.java8Learning.MethodAndConsturctorReference5;


public class MethodReferece_UsingThreadsEg2 {

	//Static Method
	public static void staticMethod() {
		for(int i=0; i<10; i++) {
		System.out.println((i+1)  + ":  Static Method Reference");
		}
	}
	
	
	//Instance Method
	public void instanceMethod() {
		for(int i=0; i<10; i++) {
		System.out.println((i+1) + ":  Instance Method Reference");
		}
	}

	public static void main(String[] args) {
	
		//Child Thread using Lambda Expression
		Runnable r1= ()->{
			for(int i=0; i<10; i++) {
				System.out.println((i+1) + ":  Child Thread - From Lambda Expression");
			}
		};
		
		new Thread(r1).start();
		//----------------------------------------------------------------------
		
		//Child Thread Using Static Method Reference (alternative to Lambda Expression)
		Runnable r2  = MethodReferece_UsingThreadsEg2::staticMethod; 
		new Thread(r2).start();

		//Child Thread Using Instance Method Reference (alternative to Lambda Expression)
		MethodReferece_UsingThreadsEg2 methodReferece_UsingThreadsEg2 = new MethodReferece_UsingThreadsEg2();
		Runnable r3  = methodReferece_UsingThreadsEg2::instanceMethod; 
		new Thread(r3).start();
		
		//----------------------------------------------------------------------
		
		//Main Thread
		for(int i=0; i<10; i++) {
			System.out.println((i+1) + ":  Main Thread");
		}

	}

}
