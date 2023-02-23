package com.cogent.systematic;

public class Persons {
	
	int personid;
	String lastname;
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persons(int personid, String lastname) {
		super();
		this.personid = personid;
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Persons [personid=" + personid + ", lastname=" + lastname + "]";
	}
	
	

}

