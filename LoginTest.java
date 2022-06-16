package com.vstl.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vstl.Generic.BaseTest;
import com.vstl.PageFactory.HomePage;
import com.vstl.flows.LoginLogoutFlow;

public class LoginTest extends BaseTest {

	private LoginLogoutFlow objLoginLogoutFlow;
	private HomePage objHomePage;
	
	public void initializeWebPages() {
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objHomePage = new HomePage(this);
		
	}

	@BeforeClass
	public void initializeWebEnvironment() {

		this.initializeWebPages();
		this.invokeApplication();
	}

@AfterClass
	public void tearDownEnvironments() {
		this.tearDown();
	}  

	
	@Test
	public void TCID_001_VerifyHomePageDisplayed() {

		objLoginLogoutFlow.doLogin();
		objHomePage.verifyHomeTextisDisplayed();
		System.out.println("Login Testcase is executed ");
	}

}
