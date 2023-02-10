package com.cogent.returntype;

public class Motor {
	int motorspeed =10;
	int speed(int accelerator) {  // 5 0r beyond  
		//process
		motorspeed = motorspeed * accelerator;
		if(accelerator<5) {
		System.out.println("safe speed "+ motorspeed);
		}else {
			System.out.println("Not safe speed "+ motorspeed);
		}
				
		return motorspeed;
		
		
	}

}

