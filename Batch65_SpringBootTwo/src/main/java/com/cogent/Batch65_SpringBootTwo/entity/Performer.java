package com.cogent.Batch65_SpringBootTwo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//few Additional Annotation needed to make it 
//complete and add Power to it
//ORM - Object relational Mapping  - JPA and Hibernate
@Entity
@Table               //(name="emp")
public class Performer {
	
	@Id                      //primary Key
	@GeneratedValue(strategy = GenerationType.AUTO)  //
	int id;
	String name;
	String project;
	String descAchievment;
	public Performer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Performer(int id, String name, String project, String descAchievment) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
		this.descAchievment = descAchievment;
	}
	@Override
	public String toString() {
		return "Performer [id=" + id + ", name=" + name + ", Project=" + project + ", descAchievment=" + descAchievment
				+ "]";
	}
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
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getDescAchievment() {
		return descAchievment;
	}
	public void setDescAchievment(String descAchievment) {
		this.descAchievment = descAchievment;
	}

	
	
	
	

}

