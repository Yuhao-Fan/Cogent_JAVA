package com.cogent.streamAPIbasics;

@FunctionalInterface     //only when we have only 1 Abstract method
public interface java8Interface {
	int data=100;
	
	
	void area();
	
	 //java 8  ---> gives the methods with definitions
	//default method
	
	default void process() {
		System.out.println("I m default method");
	}
	 //static method
	static void doIt() {
		System.out.println("I m static method");
	}
	
	
	
	

}

