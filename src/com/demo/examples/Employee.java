package com.demo.examples;

public class Employee 
{
	//public static String cityName = "KALYAN";
	public static void main(String[] args) {
		Student student = new Student("Pankaj Employee", 1);
		Student student1 = new Student("Smita Employee", 2);
		Student student2 = new Student("Anjali Employee", 3);
		Student student3 = new Student("Pranita Employee", 4);
		
		student.displayInfo();
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		
	}
}

