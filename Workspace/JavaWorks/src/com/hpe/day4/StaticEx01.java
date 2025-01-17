package com.hpe.day4;

// access specfiers -> public, protected, private, default 
// access modifiers -> static, final, synchronized, abstract 
// accessSpecifier accessModifier returnType methodName(params) 

public class StaticEx01 {

	static int x = 100;

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	// static block cannot be invoked, they are just executed in
	// sequential order

	// if you are connecting to DB
	static {
		System.out.println("X value is " + x);
		x = 200; 
		System.out.println("First Static block ");
	}
	static {
		System.out.println("This is second static block ");
	}

	// are called instance block
	// and are invoked the object is created..
	{
		System.out.println("Hey i'm in instance block... ");
	}

	public static void main(String[] args) {

		new StaticEx01();

		int result = add(10, 20);
		System.out.println("Result " + result);
		
		System.out.println("X value in main()  is " + x);
	}

	static {
		System.out.println("this is the last static block... ");
	}

}
