package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObjects.Bookings;



public class TC_Bookings extends BaseClass
{

	@Test
	public void bookings() throws InterruptedException 
	{
		Bookings bk=new Bookings(driver);
		log.info("Home page open successfully");
		
		 bk.myBookings();
	     log.info("click on my booking sucessfully");
		
        bk.sendNo();
		log.info("sending no successfully");
		
		bk.clkPassword();
		log.info("click on password successfully");
		
		bk.textPassword();
		log.info("password send successfully");
		
		bk.clkContinue();
		log.info("login successfully");
		
		 bk.myBookings();
	     log.info("click on my booking sucessfully");
	
	}
}
