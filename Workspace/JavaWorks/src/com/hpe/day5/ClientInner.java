package com.hpe.day5;

import com.hpe.day5.BusinessLogic.InnerClass;

public class ClientInner {

	public static void main(String[] args) {
		BusinessLogic bl = new BusinessLogic(); 
		bl.todo(); 
		
		InnerClass ic = new BusinessLogic().new InnerClass();
		ic.innerTODO(); 
	}
}
