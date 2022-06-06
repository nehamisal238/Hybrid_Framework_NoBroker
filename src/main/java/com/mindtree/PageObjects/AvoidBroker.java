package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AvoidBroker {

	 public WebDriver driver;
	 
		public AvoidBroker(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="(//a[@class='nb__BXOsd'])[1]")
		//@CacheLookup
		
		WebElement clkavoidbroker; //driver.findElement(By.xpath("(//a[@class='nb__BXOsd'])[1]"));

		public void clkAvoidbroker() throws InterruptedException
		{
			//driver.manage().window().maximize();
			clkavoidbroker.click();
			//Thread.sleep(3000);
		}	
		
	
	
}
