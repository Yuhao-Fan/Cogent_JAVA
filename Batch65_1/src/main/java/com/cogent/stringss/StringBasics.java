package com.cogent.stringss;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Amit";
		String str7="Amit";
		str="Sandeep";
		
		char[] str2= {'A','m','i','t'};
		String str3= new String(str2);
		String str4= new String("Amit");  // object new -- get address for object
		String str5= new String("A");
		String str6= new String("B");
		System.out.println(str);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		
		//AsCII Value - A -65 ( Hashcode is different only String )
		//Equals () -- it compares content in the String 
		//instead of reference Object
		// ==  vs equals()
		System.out.println(":::::: equals() :::::::::::");
		System.out.println(str.equals(str4)); //true
		
		System.out.println(str.equals(str5)); //False
		System.out.println(":::::  ==  ::::::::::::::::");
		System.out.println(str == str4); //false both reference
		                                 //pointing other locations
		System.out.println(str5 == str6);
		System.out.println("Mutabilty concept");
		System.out.println(str == str7);  // String Pool
		
		
		//7 th All predefined metods
		System.out.println(str.charAt(0));
		//you all try any 5 methods of your choice
		
//		StringBuffer -- thread safe
//		StringBuilder -- not thread safe
	}

}

