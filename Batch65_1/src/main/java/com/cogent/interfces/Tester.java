package com.cogent.interfces;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompleteClass cc = new CompleteClass();
		cc.add();
		cc.show();
		//cc.no=700; //final cant be modified...
		System.out.println(cc.no);
		InterfaceBasics.disp(); //ststic methods
		System.out.println(InterfaceBasics.no);
//		InterfaceBasics.add();
	}

}

