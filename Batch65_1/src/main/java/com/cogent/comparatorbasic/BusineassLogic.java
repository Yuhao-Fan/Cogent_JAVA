package com.cogent.comparatorbasic;

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
	
		//Want to see the Sorted data As per Name 
		//so now we need comparator..?
		   // new class from comparator interface
		                   //override method ....compare(){...}
		//sort() with comparator we created 
		NameComparotor nc = new NameComparotor();
		Collections.sort(emp,nc);  

		System.out.println("With Any Sorting as Name");
		for(Employee e : emp) {
		System.out.println(e);
	}
		DeptComaprator dc = new DeptComaprator();
		Collections.sort(emp,dc);  

		System.out.println("With Any Sorting as Dept");
		for(Employee e : emp) {
		System.out.println(e);
	}
		SalaryComparator sc = new SalaryComparator();
		Collections.sort(emp,sc);  

		System.out.println("With Any Sorting as Salary");
		for(Employee e : emp) {
		System.out.println(e);
	}
		
	

}
}

