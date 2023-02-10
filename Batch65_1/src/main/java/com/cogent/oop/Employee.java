package com.cogent.oop;

import java.util.Objects;

abstract class Person {
    abstract void printInfo();
}
public class Employee extends Person {
	//Attributes and varaibles
	//getter and setter
	//constructor
		// parameterised
		//default
	//toString
	
	int empId;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSalary=" + empSalary
				+ ", hashCode()=" + hashCode() + ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName()
				+ ", getEmpDept()=" + getEmpDept() + ", getEmpSalary()=" + getEmpSalary() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(empDept, empId, empName, empSalary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empDept, other.empDept) && empId == other.empId && Objects.equals(empName, other.empName)
				&& Float.floatToIntBits(empSalary) == Float.floatToIntBits(other.empSalary);
	}
	public Employee(int empId, String empName, String empDept, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}
	String empName;
	String empDept;
	float empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	void addEmployee() {
		System.out.println("addEmployee");
	}
	void deleteEmployee() {
		System.out.println("deleteEmployee");
	}
	void updateEmployee() {
		System.out.println("updateEmployee");
	}
	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		System.out.println(this.empId);
		System.out.println(this.empName);
		System.out.println(this.empDept);
		System.out.println(this.empSalary);
	}
	void displayEmployee() {
		System.out.println("displayEmployee");
		printInfo();
	}

}
