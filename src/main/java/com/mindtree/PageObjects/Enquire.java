package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enquire 
{
	 WebDriver ldriver;
	 
		public Enquire (WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

		@FindBy(xpath="//a[@class='nb__2Im-D']")
		@CacheLookup
		WebElement menuclk;

		public void MenuClk() throws InterruptedException
		{
			ldriver.manage().window().maximize();
			menuclk.click();
			Thread.sleep(3000);
		}		
		
		
		
		
		
}
