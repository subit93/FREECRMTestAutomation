package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.qa.page.HomePage;
import com.crm.qa.page.LoginPage;

public class LoginTest extends TestBase {
	LoginPage log;
	HomePage home;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initialization() 
	{
		setUp();
		
		log=new LoginPage();
		
	}
	
	
	
	
	@Test(priority=1)
	public void loginPageImagetitle()
	{
		
		Boolean imgtitle=log.loginPageImagetitle();
		Assert.assertTrue(imgtitle);
	}
	
	
	@Test(priority=2)
	public void login()
	{
		home=log.login("batchautomation","Test@12345" );
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		
	}

}
