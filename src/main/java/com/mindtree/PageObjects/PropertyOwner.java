package com.mindtree.PageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyOwner

{

	 WebDriver ldriver;
		
		public PropertyOwner(WebDriver rdriver)
				{
					ldriver=rdriver;
					PageFactory.initElements(rdriver, this);
				}
     
		@FindBy(className="tooltip-trigger-text")
		@CacheLookup
		WebElement clkowner ;

		public void clkOwner() throws InterruptedException
		{
			Set <String> s=ldriver.getWindowHandles();
			for(String i:s)
			{
				String t=ldriver.switchTo().window(i).getTitle();
				System.out.println(t);
			}
			ldriver.manage().window().maximize();
			clkowner.click();
		    Thread.sleep(4000);
	     }
		
		@FindBy(xpath ="//input[@id='userName']")
		@CacheLookup
		WebElement sendname ;
		
		public void sendName() throws InterruptedException
		{
			sendname.click();
			sendname.sendKeys("Neha Misal");
			 Thread.sleep(5000);
		}
}
