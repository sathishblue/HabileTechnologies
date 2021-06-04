package com.qa.habiletechnologies.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.habileteschnologies.base.BasePage;

public class LoginPage extends BasePage {
	
	private WebDriver driver;
	
	private By useName=By.id("uid");
	private By password=By.id("pwd");
	private By signIn=By.id("login-button");
	private By signUp=By.xpath("//a[@target=\"_blank\"]");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getTitle() throws InterruptedException
	{
		Thread.sleep(6000);
		return driver.getTitle();
	}
	public boolean isSignUpLinkExist() throws InterruptedException
	{
		Thread.sleep(6000);

		return driver.findElement(signUp).isDisplayed();
	}
	public void doLogin(String Un, String Pwd) throws InterruptedException
	{
		Thread.sleep(10000);

		driver.findElement(useName).sendKeys(Un);
		driver.findElement(password).sendKeys(Pwd);
		driver.findElement(password).click();
	}
	
	


	

}
