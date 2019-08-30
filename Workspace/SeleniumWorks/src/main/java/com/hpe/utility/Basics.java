package com.hpe.utility;

public class Basics {
	public static void sleep(int timeInSecs) {
		try {
			Thread.sleep(timeInSecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
