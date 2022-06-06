package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blog 
{
	 WebDriver ldriver;
	 
	public Blog(WebDriver rdriver)
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
	
	@FindBy(xpath="//*[@id=\'main-menu\']/div[2]/a[12]")
	@CacheLookup
	WebElement slkblog;
	
	public void slkBlog() throws InterruptedException
	{
		
		slkblog.click();
		
	}
	
	@FindBy(className="nav-link")
	@CacheLookup
	WebElement clkwebstories;
	
	public void clkWebstories() throws InterruptedException
	{
		
	 clkwebstories.click();
	 Thread.sleep(3000);
		
	}
	
	
}
