package com.cogent.oop;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instance 
		Vehicle v= new Vehicle();
		v.engine=500;
		
		Vehicle v2= new Vehicle();
		//static
		Vehicle.speed=100;
		
		
		//local
		v.startOn(200);
		Vehicle.speed=11111;
		
		
		System.out.println("first Obj static"+v.speed);  //500
		System.out.println("2nd Onject static "+v2.speed); //0 or null
		
		
		System.out.println("first Obj engine instance"+v.engine);
		System.out.println("2nd Onject engine  instance"+v2.engine);
		
		
		
		
	}

}

