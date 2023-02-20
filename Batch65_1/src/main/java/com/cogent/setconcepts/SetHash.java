package com.cogent.setconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set wont Allow duplications
		HashSet<Integer> info = new HashSet<Integer>();//Oreder not same of insertion
		info.add(11);
		info.add(111);
		info.add(113);
		info.add(114);
		info.add(111);
		info.add(115);
		//info.add("abc");  Not Valid

		System.out.println(info);
//		System.out.println(":::::::::::");
//		for (Integer i : info) {
//			System.out.println(i);
//		}
		System.out.println(":::::::::::::");
	
		////////////////////////////////////////////////////////////
		
		
		LinkedHashSet<Integer> info2 = new LinkedHashSet<Integer>();//Oreder fixed same of insertion
		info2.add(11);
		info2.add(111);
		info2.add(113);
		info2.add(114);
		info2.add(111);
		info2.add(115);
		//info.add("abc");  Not Valid

		System.out.println(info2);

		System.out.println(":::::::::::::");
		

	}

}

