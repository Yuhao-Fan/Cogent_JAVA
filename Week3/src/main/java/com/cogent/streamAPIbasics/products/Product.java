package com.cogent.streamAPIbasics.products;

public class Product {

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return balance;
	}

	public void setCost(float cost) {
		this.balance = cost;
	}

	int id;
	String name;
	float balance;
	
	public Product(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.balance = cost;
	}

	public Product() {
		//super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + balance + "]";
	}
	
	
	
	
	
	
}

