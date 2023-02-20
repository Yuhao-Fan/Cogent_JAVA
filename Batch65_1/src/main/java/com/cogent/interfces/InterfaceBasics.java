package com.cogent.interfces;

public interface InterfaceBasics {
	
	int no=100;  //final so must be initialized
	//by default variables are final 
	public abstract void show();  //public abstract (JDK 1.8 before)
	// by default methods are public abstract
	
	//jdk 1.8 made interface more power ful...
	   //Powerful ..??? How..???
//	           1) Methods can have definitions as well
//                     i)default Method with definitions
//                     ii) static methods with definitions..

	default void add() {  //jdk 1.8
		System.out.println("ADDD");
	}
	static void disp() {  //jdk 1.8
		System.out.println("Show.....");
	}
	

}

