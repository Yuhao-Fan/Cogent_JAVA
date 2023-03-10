package com.cogent.sb3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table               //(name="trip")
public class Trip {
	@Id                      //primary Key
	@GeneratedValue(strategy = GenerationType.AUTO) 
	int Id;

	@NotBlank(message = "Name is mandatory")
    String Name;
	@NotNull
	boolean Veg;

	int Kid;
    
	public Trip(int id, @NotBlank(message = "Name is mandatory") String Name,
			 boolean Veg, int Kid) {
		super();
		Id = id;
		this.Name = Name;
		this.Veg = Veg;
		this.Kid = Kid;
	}


	
	
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}


	public boolean isVeg() {
		return Veg;
	}


	public void setVeg(boolean Veg) {
		this.Veg = Veg;
	}


	public int getKid() {
		return Kid;
	}


	public void setKid(int Kid) {
		this.Kid = Kid;
	}


	@Override
	public String toString() {
		return "Trip [Id=" + Id + ", name=" + Name + ", veg=" + Veg + ", kid=" + Kid + "]";
	}



}
