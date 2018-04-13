package com.pluralsight.model;

public class Customer {
	private String firstname;
	private String lastname;

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname(){
		return this.firstname;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getLastname(){
		return this.lastname;
	}
}