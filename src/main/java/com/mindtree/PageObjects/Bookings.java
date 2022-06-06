package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookings
{
	 WebDriver ldriver;
	 
		public Bookings(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	
	
		@FindBy(id="signUp-phoneNumber")
	    @CacheLookup
	    WebElement sendno;
	    
	    public void sendNo() throws InterruptedException
	    {
	    	sendno.click();
	    	sendno.sendKeys("8552807738");
	    	Thread.sleep(5000);
	    }
	    
	    @FindBy(id="login-signup-form-login-radio-password")
	    @CacheLookup
	    WebElement clkpassword;
	    
	    public void clkPassword()
	    {
	    	clkpassword.click();
	    }
	    
	    @FindBy(id="login-signup-form__password-input")
	    @CacheLookup
	    WebElement textpassword;
	    
	    public void textPassword() 
	    {
	    	textpassword.click();
	    	textpassword.sendKeys("Neha@0810");
	    }
	    
	    @FindBy(id="signUpSubmit")
	    @CacheLookup
	    WebElement clkcontinue;
	    
	    public void clkContinue() throws InterruptedException 
	    {
	    	clkcontinue.click();
	    	Thread.sleep(5000);
	    }
	    
		@FindBy(xpath="//*[@id=\'myBooking\']/div[2]")
		@CacheLookup
		WebElement mybookings;

		public void myBookings() throws InterruptedException
		{
			ldriver.manage().window().maximize();
			mybookings.click();
			Thread.sleep(5000);
		}
      
}
