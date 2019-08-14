package com.hpe.day4;


// create a class called Address which has streetname, city, pin, state, country; 
// that has to be part of Employee and Customer

public class HasAImpll {
	public static void main(String[] args) {
		Employee employee = new Employee(); 
		
		employee.setEmpId(101);
		
		Name name = new Name(); 
		name.setFirstName("Naveen");
		name.setLastName("Kumar");
		
		employee.setName(name);
		employee.setIncome(1212);

		
		System.out.println("Emp Id " + employee.getEmpId());
		System.out.println("First Name " + employee.getName().getFirstName());
		System.out.println("Last Name " + employee.getName().getLastName());
		System.out.println("Income " + employee.getIncome());
		
	}
}
