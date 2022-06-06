package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObjects.SigninUp;


public class TC_SigninUp extends BaseClass
{

	@Test
	public void signinUp() throws InterruptedException
	{
		SigninUp lp=new SigninUp(driver);
		log.info("Home page open successfully");
		
		lp.loginClk();
		log.info("click on sign btn successfully");	
		
		lp.sendNo();
		log.info("sending no successfully");
		
		lp.clkPassword();
		log.info("click on password successfully");
		
		lp.textPassword();
		log.info("password send successfully");
		
		lp.clkContinue();
		log.info("sign up successfully");
			
	}

}
