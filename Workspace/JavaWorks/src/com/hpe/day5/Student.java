package com.hpe.day5;

public class Student  implements Comparable<Student>{
	private int sId; 
	private String name; 
	private int marks;
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student(int sId, String name, int marks) {
		super();
		this.sId = sId;
		this.name = name;
		this.marks = marks;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
//		return this.sId - o.getsId();
		return this.marks - o.getMarks(); 
	} 
	
	
	
}
