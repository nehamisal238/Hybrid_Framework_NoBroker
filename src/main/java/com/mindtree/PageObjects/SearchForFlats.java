package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchForFlats 
{
	 WebDriver ldriver;
			
	public SearchForFlats(WebDriver rdriver)
			{
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
			}
			
	@FindBy(xpath="//div[@id='searchCity']/div/div")
	@CacheLookup
	WebElement searchclk ;

	public void SearchClk() throws InterruptedException
	{
		ldriver.manage().window().maximize();
		searchclk.click();

     }
	@FindBy(id="react-select-2-option-2")
	@CacheLookup
	WebElement clkcity ;

	public void clkCity() throws InterruptedException
	{
		
	    clkcity.click();
		Thread.sleep(2000);
	
	}
	
	@FindBy(xpath="//*[@id=\"listPageSearchLocality\"]")
    @CacheLookup
    WebElement slkcity;
    
    public void slkCity() throws InterruptedException
    {
    	slkcity.click();
    	slkcity.sendKeys("shaniwar");
    	Thread.sleep(3000);
    }
    
    @FindBy(xpath="//span[contains(.,' Shaniwar Peth, Pune, Maharashtra, India')]")
    @CacheLookup
    WebElement slkadd;
    
    public void slkAdd() throws InterruptedException
    {
    	slkadd.click();
    	Thread.sleep(2000);
    }
    
    @FindBy(xpath="//*[@id=\"app\"]/div/div/div[1]/div[4]/button")
    @CacheLookup
    WebElement clksearch;
    
    public void clkSearch() throws InterruptedException
    {
    	clksearch.click();
    	Thread.sleep(3000);
    }
	
    @FindBy(xpath="//*[@id=\"getOwnerDetails\"]")
    @CacheLookup
    WebElement getdetails;
    
    public void getDetails() throws InterruptedException
    {
    	getdetails.click();
    	Thread.sleep(6000);
    }
	
    @FindBy(id="signUp-phoneNumber")
    @CacheLookup
    WebElement sendno;
    
    public void sendNo() throws InterruptedException
    {
    	sendno.click();
    	sendno.sendKeys("8552807738");
    	Thread.sleep(3000);
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
    
}