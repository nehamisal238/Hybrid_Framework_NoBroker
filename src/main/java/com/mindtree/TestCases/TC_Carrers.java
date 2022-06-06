package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObjects.Careers;

public class TC_Carrers extends BaseClass
{

	@Test
	public void careers() throws InterruptedException
	{
		Careers cl=new Careers(driver);
		log.info("Home page open successfully");
		
		cl.MenuClk();
		log.info("click on Menu btn successfully");		
	    
		cl.slkCareers();
	    log.info("select careers sucessfully");
	    
	    cl.clkOpportunities();
	    log.info("click on opportunities button suvcessfully");
	}
}