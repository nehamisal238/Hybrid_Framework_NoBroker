package com.mindtree.TestCases;

import com.mindtree.PageObjects.Enquire;

public class TC_Enquire extends BaseClass
{

	public void enquire() throws InterruptedException
	{
		Enquire bl=new Enquire(driver);
		log.info("Home page open successfully");
		
		bl.MenuClk();
		log.info("click on Menu btn successfully");	
}
}
