package com.cogent.inheritence;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.startEngine();
		car.myProperty();
		
		Vehicle v = new Vehicle();
		v.startEngine();
		//v.myProperty(); not valid
		
		
		

	}

}

