package com.hpe.day5;

public class BusinessLogic {
	private int x; 
	
	public void todo() {
		System.out.println("TODO Called.. ");
	}

	class InnerClass {
		private int iX; 
		
		public void innerTODO() {
			System.out.println("Inner TODO Called... ");
		}
	}
	
}
