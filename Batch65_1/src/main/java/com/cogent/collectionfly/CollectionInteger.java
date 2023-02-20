package com.cogent.collectionfly;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> info = new ArrayList<Integer>();
		info.add(11);
		info.add(111);
		info.add(113);
		info.add(114);
		//info.add("abc");  Not Valid

		System.out.println(info);
		System.out.println(":::::::::::");
		for (Integer i : info) {
			System.out.println(i);
		}
		
		for(int k=0;k<info.size(); k++) {
			System.out.println(info.get(k));
		}
		
		
		System.out.println(info.isEmpty());
		
		///Any 5 methods...
		System.out.println(info.indexOf(111));
		System.out.println(info.contains(113));
		info.remove(3);
		System.out.println(info);
		Iterator it =info.iterator();
		 
        // Holds true till there is single element
        // remaining in the list
        while (it.hasNext())
 
            // Print the elements of ArrayList
            System.out.print(it.next() + " ");
        System.out.println(info.toString());
	}

}

