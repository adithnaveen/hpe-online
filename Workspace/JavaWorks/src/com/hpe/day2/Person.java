package com.hpe.day2;

// package = lower case (com.hpe.somthing.something) 
// class name = Pascal case (MyBusinessLogic) 
// variables and methods (behaviors) -> camel case (creditSalary, debitBalance) 
// constants = UPPERCASE (COMPANYNAME) 

public class Person {

	// attributes 
		private int  pId;
		private String pName;
		private double income; 
	
	// Behaviors 
	
	public void setPId(int personId) {
		//i can write any condition 
		pId = personId; 
	}
	
	public void setPName(String personName) {
		if(personName.length() < 6) {
			System.out.println("oops sorry, name too small " 
					+ personName);
			this.pName = "No Name"; 
		}else {
			pName = personName;
		}
	}
		
	public void setIncome(double income) {
		if(income < 10000) {
			this.income = 10000; 
			System.out.println("Hey the income was too low, rounded to 10,000");
		}else {
			this.income = income;
		}
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", income=" + income + "]";
	}

	
	
	
	/*
	 * public void display() { System.out.println("Person Id " + pId);
	 * System.out.println("Person Name " + pName);
	 * System.out.println("Person Income " + income);
	 * 
	 * }
	 */

	

}
