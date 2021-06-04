package com.qa.habiletechnologies.test;

import org.testng.annotations.Test;

import com.qa.habiletechnologies.pages.ClientsPage;
import com.qa.habileteschnologies.base.BaseTest;

public class AddClientsTest extends BaseTest {
	
	ClientsPage clientspage;
	
	@Test
	public void AddClientsTest()
	{
		try {
			clientspage.addClients("username", "password");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
