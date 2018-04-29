package com.demo.examples;

public class StaticVariables {
	int rollno;
	String name;
	//static String college="UDIT";
	static String cityName="Mumbai";
	
	public StaticVariables(int r,String n) {
		rollno=r;
		name=n;
	}
	
	public void display() {
		//System.out.println(rollno+" "+name+" "+college);
		System.out.println(rollno+" "+name+" "+cityName);
		//System.out.println(cityName);
		
	}
	
	public static void main(String[] args) {
		StaticVariables s= new StaticVariables(101, "smita");
		s.display();
		
	}

}
