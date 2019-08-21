package com.hpe.day5;

import java.util.Arrays;
import java.util.Comparator;

// one line documentation 
/* 
 * multi line documentation 
 */

/**
 * 
 * @author Naveen
 * @apiNote This is for Testin 
 * @since 2019 Aug 
 * @version 1.0 
 */
public class StudentSortTemplate {

	
	/*
	 * public static Student[] sortStudentById(Student [] students) {
	 * 
	 * Comparator<Student> comparator = new Comparator<Student>() {
	 * 
	 * @Override public int compare(Student o1, Student o2) { return
	 * o1.getsId()-o2.getsId(); }
	 * 
	 * };
	 * 
	 * Arrays.sort(students, comparator);
	 * 
	 * return students;
	 * 
	 * }
	 */
	 	

	
	/*
	 * public static Student[] sortStudentById(Student [] students) {
	 * Arrays.sort(students, new Comparator<Student>() {
	 * 
	 * @Override public int compare(Student o1, Student o2) { return
	 * o1.getsId()-o2.getsId(); }
	 * 
	 * }); return students; }
	 */
	 
	
	/**
	 * 
	 * @param students
	 * @return Student [] 
	 * @see This method will return the sorted students 
	 *  in ascending order by Id 
	 */
	public static Student[] sortStudentById(Student [] students) {
		Arrays.sort(students, (s1, s2) -> s1.getsId() - s2.getsId()); 
		return students; 
	}
	
	public static Student[] sortStudentByMarks(Student [] students) {
		Arrays.sort(students, (s1, s2) -> s1.getMarks() - s2.getMarks()); 
		return students; 		
	}
}
