/**
 * 
 */
package com.cogent.constructor;

/**
 * @author fan
 *
 */
public class Vehicle {
	String model;
	int type;
	float cost;
	
	public Vehicle(String model, int type, float cost) {
		super();
		this.model = model;
		this.type = type;
		this.cost = cost;
	}

	Vehicle() {
		this.model = "normal";
	}


	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", type=" + type + ", cost=" + cost + "]";
	}

}
