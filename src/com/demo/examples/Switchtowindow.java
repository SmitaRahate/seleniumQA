package com.demo.examples;

public class Switchtowindow(String title)
{
	set<String> handles=driver.getwindow handles();

	for(String handle:handles)
	{
		driver.switchTo().window(handle);

		if(driver.getwindow.contain(title))
		{
			break();
		}



	}
}
