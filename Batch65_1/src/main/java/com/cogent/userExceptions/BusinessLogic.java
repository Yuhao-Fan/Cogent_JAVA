package com.cogent.userExceptions;

public class BusinessLogic {
	
	void process(int num) throws MyException {
	
	if(num==8) {
		throw new MyException("Ohh Mg ! Num 8 was not needed");
	}else {
		System.out.println("All Well...");
	}
	
	System.out.println("Success");
	}
}

