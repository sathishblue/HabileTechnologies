package com.qa.habiletechnologies.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClientsPage {
	
	private WebDriver driver;

	private By useName=By.id("uid");
	private By password=By.id("pwd");
	private By signIn=By.id("login-button");
	private By signUp=By.xpath("//a[@target=\"_blank\"]");
	private By clients=By.xpath(".//a[@id='client-dropdown']//child::i::before//[@text()=' Clients]");
	private By createClients=By.id("client_createbutton");
	private By firstName=By.id("firstname");
	private By mobileNo=By.id("mobileNo");
	private By submit=By.id("submit");
	
	public ClientsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addClients(String Un, String Pwd) throws InterruptedException
	{
		Thread.sleep(10000);

		driver.findElement(useName).sendKeys(Un);
		driver.findElement(password).sendKeys(Pwd);
		driver.findElement(password).click();
		driver.findElement(clients).click();
		driver.findElement(clients).click();
		driver.findElement(firstName).sendKeys("Sathsh");
		driver.findElement(mobileNo).sendKeys("8221090607");
		driver.findElement(submit).click();
	}
 

	
	

}
