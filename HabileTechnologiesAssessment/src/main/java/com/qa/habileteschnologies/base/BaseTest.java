package com.qa.habileteschnologies.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.habiletechnologies.pages.LoginPage;

public class BaseTest {
	
	public BasePage basePage;
	public Properties prop;
	WebDriver driver;
	public LoginPage loginpage;
	
	@BeforeMethod
	public void setup()
	{
		basePage=new BasePage();
		prop=basePage.init_prop();
		String browser=prop.getProperty("browser");
		driver=basePage.init_browser(browser);
		loginpage=new LoginPage(driver);
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
