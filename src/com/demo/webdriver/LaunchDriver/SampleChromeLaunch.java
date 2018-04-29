package com.demo.webdriver.LaunchDriver;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleChromeLaunch {
	static WebDriver driver ;
	public static void main(String[] args) throws MalformedURLException {
		String GridURL="http://localhost:4444/wd/hub";
		//System.setProperty("webdriver.chrome.driver","\\D:Grid\\chromedriver.exe");
		//driver = new ChromeDriver();
		DesiredCapabilities capability = new DesiredCapabilities();
		capability=DesiredCapabilities.chrome();
		driver =new RemoteWebDriver(new URL(GridURL),capability);
		String baseUrl = "http://opensource.demo.orangehrmlive.com/";
		String expectedTitle="OrangeHRM";
		String actualTitle="";
		driver.get(baseUrl);
		
		WebElement userName= driver.findElement(By.id("txtUsername"));//By id 	
		WebElement password= driver.findElement(By.name("txtPassword"));//By name 
		WebElement submit= driver.findElement(By.className("button"));//By name 	
		userName.sendKeys("Admin");
		Report("UserName entered "+ "Admin");
		password.sendKeys("admin");
		Report("Password entered "+ "admin");
		submit.click();
		Report("submit button clicked");

		actualTitle=driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed");
		}else{
			System.out.println("Test Failed");
		}
		//driver.close();


	}
	private static void Report(String string) {
		// TODO Auto-generated method stub
		
	}

}
