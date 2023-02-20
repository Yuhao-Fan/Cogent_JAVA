package com.cogent.userExceptions;

public class MyException extends Exception {

	public MyException(String msg) {
	  super(msg);
		System.out.println("MyException created");
		// TODO Auto-generated constructor stub
	}
	
	//throw- explicitly throw the created Objects...
	//throws-- whenever checked exception occurs that during that ,Method should 
	     // use throws keyword at definition along with Exception class Name
	
}

