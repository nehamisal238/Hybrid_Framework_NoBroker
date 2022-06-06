package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObjects.SearchForFlats;

public class TC_SearchForFlats extends BaseClass
{

	@Test
	public void SearchForFlats() throws InterruptedException
	{
		SearchForFlats lp=new SearchForFlats(driver);
		log.info("Home page open successfully");
		
		lp.SearchClk();
		log.info("selectfor search successfully");	
		
		lp.clkCity();
		log.info("click on city sucessfully");
		
		lp.slkCity();
		log.info("select searchbar sucessfully");
		
		lp.slkAdd();
		log.info("selct address sucessfully");
		
		lp.clkSearch();
		log.info("click on search button sucessfully");
		
		lp.getDetails();
		log.info("click on get  details sucessfully");
	
		lp.sendNo();
		log.info("sending no successfully");
		
		lp.clkPassword();
		log.info("click on password successfully");
		
		lp.textPassword();
		log.info("password send successfully");
		
		lp.clkContinue();
		log.info("Owner detail get successfully");
	}   
	
	
}
