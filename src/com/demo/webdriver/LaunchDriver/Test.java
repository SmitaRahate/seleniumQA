package com.demo.webdriver.LaunchDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{

	public void SwitchtoWindow(String title) 
	{
		System.setProperty("webdriver.chrome.driver","\\D:Grid\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Set<String> handles=driver.getWindowHandles();

		for(String handle:handles)
		{
			driver.switchTo().window(handle);

			if(driver.getTitle().contains(title));
			{
				break;
			}



		}

	}


}
