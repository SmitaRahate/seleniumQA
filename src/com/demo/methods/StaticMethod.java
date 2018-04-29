package com.demo.methods;

import com.demo.examples.StaticVariables;

public class StaticMethod {
	
	static int totallength;
	static int averagelength;
	
	public static void TotalLength(String a, String b){
		totallength =a.length() + b.length();
		return;
		
	}
	
public static int AverageLength(String a, String b){
		
	averagelength =a.length()+ b.length()/2;
	
		return averagelength;
	
		
	}
	public static void main(String[] args) {
		
		/*StaticMethod s1=new StaticMethod();
		s1.totallength("smita","rahate");
		System.out.println();
		*/
		
	}

	
	

}
