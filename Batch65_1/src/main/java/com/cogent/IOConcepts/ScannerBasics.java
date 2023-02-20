package com.cogent.IOConcepts;

import java.util.Scanner;
//  package-- >  java.util
// pre defined class name is ----> Scanner
public class ScannerBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to Perform Addition of two int Numbers...
		//you need to Ask user to enter Values...!
		
		int no1;
		int no2;
		
		try (//Library of I/ O
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter No1");
			no1= sc.nextInt();
		}
		System.out.println("you have entered "+ no1);
		
	
		

	}

}

