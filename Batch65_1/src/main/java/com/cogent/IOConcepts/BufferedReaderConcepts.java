package com.cogent.IOConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderConcepts {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		//WAP to Add 2 number
		float no1;
		float no2;
		float no3;
		
		System.out.println("hey Pls enter the 2 Numbers");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		no1= Float.parseFloat(br.readLine());
		no2= Float.parseFloat(br.readLine());
		no3= Float.parseFloat(br.readLine());
		float no4= no1 + no2+no3;
		
		System.out.println("The result is "+ no4);
		
		
		
		
		
	}

}

