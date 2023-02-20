package com.cogent.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map familly
		
//		1 HashMap -- Not Synchronized
//		
//		2 HashTable  -- Synchronized
//		SortedMap -- Interface
//		3 TreeMap  --Not Synchrozed

		
		//Key value  
		// put()   ---  No add() 
		
		
		HashMap<Integer, String> mapinfo= new HashMap<Integer ,String>();
		mapinfo.put(1, "faria");
		mapinfo.put(2, "Kevin");
		mapinfo.put(3, "Kip");
		mapinfo.put(2, "Samuel");  // replaces
		
		System.out.println(mapinfo);
		
		
		
		
		//Iterator-- looping   
		   //Entryset 
		          //key Value
		
		
		// using iterators
				Iterator<Map.Entry<Integer, String>> itr = mapinfo.entrySet().iterator();
				while(itr.hasNext())
				{
					Map.Entry<Integer, String> entry = itr.next();
					System.out.println("Key = " + entry.getKey() +
										", Value = " + entry.getValue());
				}
				
       //Enhanced for Loop
				System.out.println("As Per Enhanced for Loop");
				// using for-each loop for iteration over Map.entrySet()
				for (Map.Entry<Integer,String> entry : mapinfo.entrySet()) {
					System.out.println("Key = " + entry.getKey() +
									", Value = " + entry.getValue());
			}


		
		
		
		
		
	}

}

