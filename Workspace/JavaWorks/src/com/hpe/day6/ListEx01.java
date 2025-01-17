package com.hpe.day6;

import java.util.ArrayList;

class Dummy {
	public void hi() {
		System.out.println("hi... ");
	}
}

// ctrl + shift + o will import or remove unused classes/interface 
public class ListEx01 {
	public static void main(String[] args) {
		
		// raw 
		ArrayList list = new ArrayList();
		
		list.add(10); 
		list.add(34.5); 
		list.add(true); 
		list.add(new Object()); 
		list.add(new Dummy()); 

		for(Object temp : list) {
			
			if(temp instanceof Dummy) {
			((Dummy) temp).hi();
			}
		}
		
		
		
	}
}
