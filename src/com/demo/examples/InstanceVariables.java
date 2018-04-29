package com.demo.examples;

import java.awt.DisplayMode;

public class InstanceVariables {
	/*int rollno;
	String name;
	
	public InstanceVariables(int r,String n) {
		rollno = r;
		name=n;
	}
	
	public void display() {
		System.out.println(rollno+" "+name);
		
	}
	
	public static void main(String[] args) {
		InstanceVariables s1= new InstanceVariables(101, "smita");
		InstanceVariables s2= new InstanceVariables(102, "mita");
		s1.display();
		s2.display();
	}
}*/

		public String name;
		// salary variable is visible in Student class only.
		private int marks;
		
		public InstanceVariables(String StudName) {
			this.name = StudName;	
		}
		public void setMarks(int studMarks) {
			marks = studMarks;
			
		}
		public void printStud() {
			System.out.println("Student name : " + name);
			System.out.println("Marks :" + marks);
		}
		public static void main(String args[]) {
			InstanceVariables st = new InstanceVariables("John");
			st.setMarks(80);
			st.printStud();
		}
	}


