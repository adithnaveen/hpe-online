package com.hpe.day5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorialDateEx01 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(); 
		
		System.out.println("Month is " + gc.get(Calendar.MONTH));
		System.out.println("Year is " + gc.get(Calendar.YEAR));
		System.out.println("Hour is " + gc.get(Calendar.HOUR));
		
//		if(gc.isLeapYear(gc.get(Calendar.YEAR))) {
//			System.out.println("Leap year ");
//		}else {
//			System.out.println("Not a leap year ");
//		}

		
		System.out.println(gc.isLeapYear(gc.get(Calendar.YEAR))
				? "Leap Year":"Not A Leap Year");
		
		
	}
}
