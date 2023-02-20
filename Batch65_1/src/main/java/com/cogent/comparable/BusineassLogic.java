package com.cogent.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class BusineassLogic {
	
	void addRecords() {
		//collection
		//object need to be added
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(111, "Daniel", "SW", 75000.00f));
		emp.add(new Employee(112, "Ron", "Admin", 70000.00f));
		emp.add(new Employee(113, "Sam", "Hr", 60000.00f));
		emp.add(new Employee(114, "Jack", "Sales", 55000.00f));
		emp.add(new Employee(115, "Sid", "Promotions", 40000.00f));
		
		System.out.println("Without Any Sorting");
		for(Employee e : emp) {
		System.out.println(e);
	}
		Collections.sort(emp);
		for(Employee e : emp) {
			System.out.println(e);
		}
		
	

}
}

