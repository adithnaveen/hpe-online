package com.hpe.day4;

// if the class has private variables and 
// public getters and setters then those are called as 
// Bean Class 
// Java Bean Class are called as reusable component 
public class Name {
	private String firstName; 
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	} 
	
	
	
}
