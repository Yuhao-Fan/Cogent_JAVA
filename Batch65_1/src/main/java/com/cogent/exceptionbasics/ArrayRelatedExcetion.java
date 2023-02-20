package com.cogent.exceptionbasics;

public class ArrayRelatedExcetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int info[]= new int[5];  //Array definition
		System.out.println("i m here");
		info[0]=10;
		info[1]=20;
		info[2]=10;
		info[3]=20;
		info[4]=10;
		System.out.println("going beyoond");
		info[5]=20;  //6th elements
		System.out.println("success");
		
		
		

	}

}

