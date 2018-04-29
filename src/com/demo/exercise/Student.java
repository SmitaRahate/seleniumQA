package com.demo.exercise;

public class Student{
	String name ;
	int rollno;

	public Student(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	public static void Main(String[] args) {
		Student v=new Student("Smita", 101);
	}
}