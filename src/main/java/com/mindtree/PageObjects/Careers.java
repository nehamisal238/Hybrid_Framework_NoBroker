package com.mindtree.PageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careers 

	{
		 WebDriver ldriver;
		 
		public Careers(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
		@FindBy(xpath="//*[@id=\'main-menu\']/div[1]")
		@CacheLookup
		WebElement menuclk;

		public void MenuClk() throws InterruptedException
		{
			ldriver.manage().window().maximize();
			menuclk.click();
			Thread.sleep(3000);
		}	
		
		@FindBy(xpath="//*[@id=\"main-menu\"]/div[2]/a[10]")
		@CacheLookup
		WebElement slkcarrers;
		
		public void slkCareers() throws InterruptedException
		{
			
		slkcarrers.click();
			
		}
		
		@FindBy(xpath="//*[@id=\"app\"]/div/div/section/div/div[1]/div[2]/button")
		@CacheLookup
		WebElement clkopportunities;
		
		public void clkOpportunities() throws InterruptedException
		{
			Set <String> s=ldriver.getWindowHandles();
			for(String i:s)
			{
				String t=ldriver.switchTo().window(i).getTitle();
				System.out.println(t);
			}
				
		      clkopportunities.click();
			  Thread.sleep(5000);
		}
			

}
