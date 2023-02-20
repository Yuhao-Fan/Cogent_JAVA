package com.cogent.collectionfly;

import java.util.ArrayList;

public class ShoppingCart {
	
	
	void addProduct() {
		//create Objects of Product
		//Create Collection or Bucket to Add Product to it
		
		ArrayList<Product> bucketEmp = new ArrayList<Product>();
		Product p1= new Product(111, "Laptopt", 35000.55f);
		Product p3= new Product(111, "Laptopt", 30000.55f);
		Product p4= new Product(111, "Laptopt", 45000.55f);
		bucketEmp.add(p1);
		bucketEmp.add(new Product(222, "AC", 25000.55f));
		bucketEmp.add(p3);
		bucketEmp.add(p4);
		
		for (Product p : bucketEmp) {
			System.out.println(p);
			
		}
		System.out.println(":::::::::::::::::");
		for (Product p : bucketEmp) {
			if(p.getCost()>=35000.00f){
			System.out.println("cost above 35k "+ p);
			}
		}
		
		
	}

}

