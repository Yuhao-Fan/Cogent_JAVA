package com.cogent.finalKey;

public class Employee {
	
	final int id=111;  //final variablemust be init at the start
	
	 final void show() {
		
		System.out.println(id);
	   //id = id + 50;  //final variables cant be modified
	}

}

