package com.cogent.constructor;

public class LTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library l1= new Library();
		l1.display();
		Library.Librarian = 3;
		
		Library l2= new Library();
		l1.student = 6;
		l2.student = 7;
		l2.display();
	}
}
