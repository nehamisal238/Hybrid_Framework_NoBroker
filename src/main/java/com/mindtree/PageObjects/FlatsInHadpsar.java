package com.mindtree.PageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlatsInHadpsar
{
	  WebDriver ldriver;
		
		public FlatsInHadpsar(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//div[@class='heading-6 nb__3YrHu nb__3S6MT']")
		@CacheLookup
		WebElement clkonhadpsar;

		public void clkOnhadpsar() 
		{
			ldriver.manage().window().maximize();
			Set <String> s=ldriver.getWindowHandles();
			for(String i:s)
			{
				String t=ldriver.switchTo().window(i).getTitle();
				System.out.println(t);
			}
			
			clkonhadpsar.click();
		}	
			
	
	

}
