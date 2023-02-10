package com.cogent.constructor;

public class VTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v1= new Vehicle();
		Vehicle v2= new Vehicle("para",6,9999.99f);
		Vehicle v3= new Vehicle();
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
	}
}
