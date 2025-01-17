package com.hpe.day4;

public class FigureClient {
	
	public static void showArea(IFigure figure) {
		figure.area(); 
	}
	
	public static void main(String[] args) {
		IFigure figures[]  = new IFigure[5]; 
		
//		IFigure f = new Circle(21); 
		
		figures[0] = new Circle(10); 
		figures[1] = new Square(12);  
		figures[2] = new Rectangle(20, 10);  
		figures[3] = new Square(4);  
		figures[4] = new Circle(80); 
		
		/*
		 * for(int i=0; i< figures.length; i++) { showArea(figures[i]); }
		 */
		
		// forEach 
		for(IFigure temp : figures) {
			showArea(temp); 
		}
		
		System.out.println(figures[2] instanceof Circle);
		
		
		
	}
}
