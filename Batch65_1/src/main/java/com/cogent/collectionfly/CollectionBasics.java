package com.cogent.collectionfly;

import java.util.ArrayList;

public class CollectionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//ytype of bucket    //name of bucket
		ArrayList<String> batch65 = new ArrayList<String>();
		           //type of object
		
		batch65.add("Abhi");
		batch65.add("Keyu");
		batch65.add("LeCai");
		batch65.add("Amanda");
		batch65.add("Guangjian");
		batch65.add("Quoiqin");
		batch65.add("yuhan haung");
		batch65.add("yohan fan");
		batch65.add("HuangLu");
		
		System.out.println(batch65);
		System.out.println(":::::::::::::::::");
		
		//enhanced for Loop 
		for( String i : batch65) {
			System.out.println("Objects in Bucket "+i);
		}
		
		
		
		
		
		

	}

}

