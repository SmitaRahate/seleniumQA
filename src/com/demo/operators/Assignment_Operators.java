package com.demo.operators;

public class Assignment_Operators {
	//Normal Assignment

	static int speed=80;//speed variable gets the value 80
	static int distance=20;//distance  variable gets the value 20
	static int time=10;// time variable gets the value 10
	static String name="Tools";//name variable gets the value tool
	static boolean isGood=true;//isGood variable gets the value true

	public static void main(String[] args) {
		System.out.println("Value stored in the speed variable is:" +speed);
		System.out.println("Value strored in the distance variaable is:" +distance);
		System.out.println("Value stored in the time variable is:" +time);
		System.out.println("Value stored in the name variable is:" +name);
		System.out.println("Value stored in the isGood variable is:" +isGood);


		speed=100;
		time=distance;
		name="QA";
		isGood=false;

		System.out.println("Value stored in the speed variable is:" +speed);
		System.out.println("Value strored in the distance variaable is:" +distance);
		System.out.println("Value stored in the time variable is:" +time);
		System.out.println("Value stored in the name variable is:" +name);
		System.out.println("Value stored in the isGood variable is:" +isGood);

		speed = distance=0;
		System.out.println("Value stored in the speed variable is:" +speed);





	}

}
