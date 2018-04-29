package com.demo.examples;

public class LocalVariables {
	
	public void Salary(int salesbonus) {
		String Name;
		int currentMonthbonus=salesbonus;
		int sal=1000;
		sal=sal+currentMonthbonus;
		System.out.println("Monthly Salary:" +sal);
		}
	public static void main(String[] args) {
		LocalVariables m = new LocalVariables();
		m.Salary(0);
	}

}
