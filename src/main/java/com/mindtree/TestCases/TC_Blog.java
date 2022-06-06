package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObjects.Blog;

public class TC_Blog extends BaseClass
{

	@Test
	public void blog() throws InterruptedException
	{
		Blog bl=new Blog(driver);
		log.info("Home page open successfully");
		
		bl.MenuClk();
		log.info("click on Menu btn successfully");	
	
	    bl.slkBlog();
	    log.info("select blog sucessfully");
	    
	    bl.clkWebstories();
	    log.info("webstories open sucessfully");
	    
	
	
	
	}		
}
