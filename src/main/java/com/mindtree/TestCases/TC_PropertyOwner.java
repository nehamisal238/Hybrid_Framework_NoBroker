package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObjects.PropertyOwner;

public class TC_PropertyOwner extends BaseClass
{

	@Test
	public void propertyownerS() throws InterruptedException
	{
	    PropertyOwner eq=new PropertyOwner(driver);
		log.info("Home page open successfully");
        
		eq.clkOwner();
		log.info("click on for property owner sucessfully");
		
		eq.sendName();
		log.info("send user name sucessfully");
		
	}
}

