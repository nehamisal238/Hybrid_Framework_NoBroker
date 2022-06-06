package com.mindtree.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.AvoidBroker;

public class TC_AvoidBroker extends BaseClass
{
 
	public WebDriver driver;
	
	@Test
	public void avoidBroker() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/Hybrid_Framework_NoBroker/Driver/chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("https://www.nobroker.in/");
		
	AvoidBroker ab=new AvoidBroker(driver);
		//log.info("Home page open successfully");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ab.clkAvoidbroker();
		//log.info("click on avid brokers sucessfully");
		
	
		
		
}
}