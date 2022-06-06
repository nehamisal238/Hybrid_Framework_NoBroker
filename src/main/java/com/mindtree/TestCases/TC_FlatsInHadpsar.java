package com.mindtree.TestCases;

import org.testng.annotations.Test;
import com.mindtree.PageObjects.FlatsInHadpsar;

public class TC_FlatsInHadpsar extends BaseClass
{
	@Test
	public void flatsinhadpsar() throws InterruptedException
	{
		FlatsInHadpsar fl=new FlatsInHadpsar(driver);
		log.info("Home page open successfully");
	
		fl.clkOnhadpsar();
		log.info("click on hadpsar for rent sucessfully");
	
}
}