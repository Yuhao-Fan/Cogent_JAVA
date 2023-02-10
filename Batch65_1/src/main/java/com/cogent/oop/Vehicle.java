package com.cogent.oop;

public class Vehicle {
	
	int engine; // instance variable
	static int speed;  //static variable
	
	void startOn(int accelerater) {  //local variable
		int totalSpeed=accelerater*2;   //local variable
		System.out.println("instance "+engine);
		System.out.println("static instance "+speed);
		System.out.println("Acce "+ accelerater);
	}
	
	// 2 nd: How they will get Accessed 
	
	
	

}

