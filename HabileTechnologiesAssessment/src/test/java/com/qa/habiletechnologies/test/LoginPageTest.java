package com.qa.habiletechnologies.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.habileteschnologies.base.BaseTest;



public class LoginPageTest extends BaseTest {
	
	@Test(priority=1)
	public void verifyLoginPageTitle() throws InterruptedException
	{
		String title=loginpage.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "CloudBankIN - A Saas Banking Engine");
	}
	
	@Test(priority=2)
	public void verifySignupLink() throws InterruptedException
	{
    Assert.assertTrue(loginpage.isSignUpLinkExist());	
	}
	
	@Test(priority=3)
	public void dpLoginTest() throws InterruptedException
	{
		loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	

}
