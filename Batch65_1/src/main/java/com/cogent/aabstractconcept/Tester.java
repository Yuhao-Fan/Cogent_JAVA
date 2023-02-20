package com.cogent.aabstractconcept;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Abstract class Objects cant be created !
		//Employee emp3= new Employee();
		// can we create Object References -- yes
		Employee emp1;   //   Object References
		
		//1st way
		HrDept dept= new HrDept();
		dept.add();
		dept.disp();
		//2 nd way
		emp1= new HrDept(); //Object of complete or concrete 
		emp1.add();
		emp1.disp();
		System.out.println(emp1.a);
		

	}

}

