package com.hpe.day5;

import java.util.Arrays;

public class SortClient {
	public static void main(String[] args) {
		Student students [] = {
				new Student(101, "Harry", 43), 
				new Student(34, "Peter", 89), 
				new Student(567, "Andy", 77), 
				new Student(12, "Murphy", 43), 
				new Student(77, "Becky", 56) 
		}; 
		
		
		for(Student temp : students) {
			System.out.println(temp);
		}
		
//		StudentSortTemplate.sortStudentById(students); 

		StudentSortTemplate.sortStudentByMarks(students); 
		System.out.println("------------------");
		for(Student temp : students) {
			System.out.println(temp);
		}
		
	}
}
