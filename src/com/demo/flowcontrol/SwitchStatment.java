package com.demo.flowcontrol;

public class SwitchStatment {
	public static void main(String[] args) {
		for (int i=0;i<=2;i++)
		//int i=1;
		{
			switch(i)
			{  
			case 1:System.out.println("one:" +i);
			break;
			case 2:
			case 3:System.out.println("Two or Three:" +i);
			break;
			
				
			default:System.out.println("Default case" +i); 

			}
		}
	}
}








