package com.cogent.streamAPIbasics.products;

import java.util.ArrayList;
import java.util.List;



public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> bucketEmp = new ArrayList<Product>();
		Product p1= new Product(111, "Dell Laptopt", 35000.11f);
		Product p3= new Product(112, "Acer Laptopt", 30000.22f);
		Product p4= new Product(113, "Mac Laptopt", 45000.33f);
		bucketEmp.add(p1);
		bucketEmp.add(new Product(222, "AC", 25000.44f));
		bucketEmp.add(p3);
		bucketEmp.add(p4);
		
		//objects -- to collection : so my collection is ready 
		//sequesnce of Objects - 4 stream of 4 Objects
		//Manipulations on individual Object
		      // 25 Predefined way of Manipulation - stream API
		               //Like forEach ,filter() , map() ,distict() count()
		
		List<Float> bucketEmp2=bucketEmp.stream()
		.filter(p ->p.balance> 45000.00)   // filtering price  
        .map(pm ->pm.balance-5000).toList();          // fetching price  
    //   .forEach(p->System.out.println(p));  // iterating price 

		//bucketEmp.stream().filter(p ->p.cost> 30000.00).map(pm ->pm.cost-5000).forEach(System.out::println);
		System.out.println(bucketEmp2);
		

	}

}

