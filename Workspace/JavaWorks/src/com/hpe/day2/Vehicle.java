package com.hpe.day2;


// if you dont know the implementation then make the methods as abstract 
// and if you make the method as abstract then the class extends should 
// give the implementation 

// and if the class has abstract method then signature of the class should 
// have abstract key word 

// if the class signature is abstract then creating an object of the class 
// is not allowed. 

// these classes are called as standards / defn 
public abstract  class Vehicle {
	
	public Vehicle() {
		// its invoking Object
		super(); 
		System.out.println("Vehicle creation in progress... ");
	}
	// since i dont have the implementation this does not mean other 
	// other should not have, infact other should have 
	public abstract void move();
	
	public abstract void stop();
	
	public void driveLicense() {
		System.out.println("All drivers should have license... ");
	}
	
	
	
	
}
