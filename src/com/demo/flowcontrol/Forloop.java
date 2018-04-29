package com.demo.flowcontrol;

public class Forloop {
public static void main(String[] args) {
	//forEachloopsimple
	for(int i=1;i<=10;++i)
	{
		
		System.out.println("Line" +i);
	}
	////forEachloop
	String[] values = new String[4];
	values[0]="WebDriver";
	values[1]="Grid";
	values[2]="IDE";
	values[3]="RC";
	for (String value:values)
	{
		System.out.println(value);
	}
	///forloopbreak
	for(int i=1;i<values.length;++i)
	{
		
		System.out.println("i am into breat for loop");
		if (values[i]== "IDE")
		{
			break;
		}
		System.out.println(values[i]);
		
	}
	///for loop continue
	for (String value:values)
	{
		if(value.startsWith("G"))
	{
			continue;
	}
		System.out.println(value);
}
}
}
