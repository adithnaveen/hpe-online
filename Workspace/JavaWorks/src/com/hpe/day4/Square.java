package com.hpe.day4;

public class Square implements IFigure{

	private int len; 

	
	public int getLen() {
		return len;
	}

	public Square(int len) {
		this.len = len; 
	}
	
	@Override
	public void area() {
		System.out.println("Area of Square " + (len * len));
	}

}
