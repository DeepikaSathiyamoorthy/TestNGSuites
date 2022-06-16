package com.vstl.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vstl.Generic.BaseTest;
import com.vstl.PageFactory.HomePage;
import com.vstl.PageFactory.PortfolioPage;
import com.vstl.flows.DashboardFlow;
import com.vstl.flows.LoginLogoutFlow;

public class LoginLogoutTest extends BaseTest {

	private LoginLogoutFlow objLoginLogoutFlow;
	private HomePage objHomePage;
	private DashboardFlow objDashboardFlow;
	private PortfolioPage objPortfolioPage;

	public void initializeWebPages() {
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objHomePage = new HomePage(this);
		objDashboardFlow = new DashboardFlow(this);
		objPortfolioPage = new PortfolioPage(this);

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

	@Test(priority = 2, dependsOnMethods = "TCID_001_VerifyHomePageDisplayed", groups = { "functional", "smoke" })
	public void TCID_002_VerifyPortfolioPageIsDisplayed() {

		objDashboardFlow.openeBSConfigportfolio();
		objPortfolioPage.verifyPortfolioTextisDisplayedOnDashBoardPage();
		this.goBackToPreviousPage();
		this.setImplicitWait(20000);
		objDashboardFlow.openPremeraProduct();
		objPortfolioPage.verifyPortfolioTextisDisplayedOnDashBoardPage();
		this.goBackToPreviousPage();
		System.out.println("TestCase Priority 2 is executed ");

	}

	@Test(priority = 1, groups = {"smoke","functional", "regression"})
	public void TCID_001_VerifyHomePageDisplayed() {

		objLoginLogoutFlow.doLogin();
		objHomePage.verifyHomeTextisDisplayed();
		System.out.println("TestCase Priority 1 is executed ");
	}

}
