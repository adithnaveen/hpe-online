package com.hpe.day4;

class Device{

	@Override
	protected void finalize() throws Throwable {
	// you can nullify some object before this 
	// this object is purged 
		
		System.out.println("Finalize of Device invoked.. ");
	}
	
	// overloading 
	public void display() {
		System.out.println("Display without any param");
	}
	
	public void display(int x) {
		System.out.println("Display invoked with 1 param " + x);
	}
	
}

public class GCTest {
	public static void main(String[] args) {
		
		System.gc(); 
		Runtime.getRuntime().gc();
		// depricated.. 
		System.runFinalizersOnExit(true);
		
		Device d = new Device(); 
		System.out.println(d.hashCode());
		System.out.println("This is my last line ");

		d.display(10);
	}
}
