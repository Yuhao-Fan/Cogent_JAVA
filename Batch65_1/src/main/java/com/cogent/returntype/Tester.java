package com.cogent.returntype;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instance 
		Machine v= new Machine();
		v.engine=500;
		
		Machine v2= new Machine();
		//static
		Machine.speed=100;
		
		
		//local
		v.startOn(200);
		Machine.speed=11111;
		
		
		System.out.println("first Obj static"+v.speed);  //500
		System.out.println("2nd Onject static "+v2.speed); //0 or null
		
		
		System.out.println("first Obj engine instance"+v.engine);
		System.out.println("2nd Onject engine  instance"+v2.engine);
		
		
		
		
	}

}

