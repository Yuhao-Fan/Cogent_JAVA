package com.cogent.exceptionbasics;

public class MyFirstException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.println("Hey how you all doing");
		System.out.println("Lets initialize some numbers!");
		int no1=10;
		int no2=0;
		
		System.out.println("all good so far!");
		int no3=123;
		
		try {
		
//		no3= no1 / no2;  //-----important line  infinity  Abnormal Situation
		//JVM activates
		//Will idetify Problem and Accordingly Exception Object gets created
		//and created exception Object gets thrown
		//which leads to Abrupt termination of Application
		
		
		System.out.println("the result is "+ no3);
		
		}
		catch(Exception e) {
			System.out.println("Now situation in control");
			e.printStackTrace();
			
		}try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		 finally {

	         System.out.println("First element value: ");
	         System.out.println("The finally statement is executed");
	      }
		System.out.println("Success");
	
		
		
		
		
	}

}

