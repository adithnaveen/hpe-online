package com.hpe.day4;

public class Circle implements IFigure {

	private int radius; 
	
	public Circle(int radius) {
		this.radius = radius; 
	}
	
	@Override
	public void area() {
		// PI * R * R
		System.out.println("Area of Circle " +(PI * radius * radius));
	}

}
