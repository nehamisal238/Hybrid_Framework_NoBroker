package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObjects.LoginPage;

public class TC_LoginPage extends BaseClass
{
	@Test
	public void loginpage() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		log.info("Home page open successfully");
		
		lp.loginClk();
		log.info("click on login btn successfully");	
		
		lp.sendNo();
		log.info("sending no successfully");
		
		lp.clkPassword();
		log.info("click on password successfully");
		
		lp.textPassword();
		log.info("password send successfully");
		
		lp.clkContinue();
		log.info("login successfully");
			
	}
	

}
