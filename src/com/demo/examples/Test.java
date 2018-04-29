package com.demo.examples;

public class Test {
	static String cityName="Mumbai";
	public static void main(String[] args) {
	
	StaticVariables s = new StaticVariables(106,"preeti");
	String city = Test.cityName;
	System.out.println(city);
	//System.out.println(rollno+" "+name+" "+college+" "+cityName);
	//Test.cityName="mum";
	//s.cityName="Mum";
	s.display();
	
		
	}

}
/*public class Test {
	int rollno;
	String name;
	
	public static void main(String[] args) {
		InstanceVariables s1= new InstanceVariables(101, "smita");
		InstanceVariables s2= new InstanceVariables(102, "mita");
		s1.display();
		s2.display();
	}
}*/
	