package com.demo.examples;
//created class
public class Student {
	private String name;
	private int id;
	public static String collegeName = "UDIT";
	private static String cityName = "MUMBAI";
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public Student(String name, int id, String cityName)
	{
		this.name = name;
		this.id = id;
		this.cityName = cityName;
	}

	public void displayInfo()
	{
		System.out.println(id +" "+ name+ " "+collegeName+" "+cityName);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

	public static String getCityName() {
		return cityName;
	}

	public static void setCityName(String cityName) {
		Student.cityName = cityName;
	}

	public static void main(String[] args) 
	{
		Student student = new Student("Pankaj", 1);
		Student student1 = new Student("Smita", 2);
		Student student2 = new Student("Anjali", 3);
		Student student3 = new Student("Pranita", 4);
		
		student.displayInfo();
		student.setName("PRANITA");
		Student.setCityName("BADLAPUR");
		student.displayInfo();
		/*student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();*/
		
	}
}  