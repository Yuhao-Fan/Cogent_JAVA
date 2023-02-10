package com.cogent.control;

public class VoterApp {
	void checkEligiblity(int age) { 

		if(age<18) {
			System.out.println("You are not able to vote!");
		}else {
			System.out.println("You can vote!");
		}
		
		
	}

}

