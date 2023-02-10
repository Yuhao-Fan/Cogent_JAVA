package com.cogent.thiskey;

public class Employee {

	int id; // instance
	String name;

	public Employee() {
		super();
		System.out.println("I m default cont");
	}

	public Employee(int id, String name) { // Local
        this();
		this.id = id; // this key is used with instance var
		this.name = name;
		System.out.println("two param");
	}

	public Employee(int id, String name, int salary) { // Local
        this(1,"Abhi");
		this.id = id; // this key is used with instance var
		this.name = name;
		System.out.println("three param");
	}

}

