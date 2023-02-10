package com.cogent.jump;

public class LoopBreakrer {
	
	
	void runCode() {
		
		for(int i=1; i<=100 ;i= i+3) {
		if(i==5) {
			break;
		}
		System.out.println("Hello "+ i);
		
	}
		System.out.println("Loop over");

}
}

