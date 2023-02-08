package com.cogent.basics;

public class Process_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process p = new Process();
		float res = p.addFloat(0.1f, 0.5f, 0.3f);
		System.out.println(res);
		
		p.display();

	}

}
