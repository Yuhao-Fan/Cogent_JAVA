package com.cogent.staticmethods;

public class Employee {
	
	static int id=111;
	static String name="Amit";
	
	void disp() {
		System.out.println("Normal Method");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		
	}
	
	static void show() {
		System.out.println("static Method");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		
	}
	
	
	
	

}

