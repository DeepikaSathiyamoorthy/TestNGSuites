package com.vstl.scripts;

import org.testng.annotations.Test;

import com.vstl.Generic.BaseTest;
import com.vstl.flows.DesignFlow;

public class DesignTest extends BaseTest {

	private DesignFlow objDesignFlow;
	//private LoginLogoutFlow objLoginLogoutFlow;

	public void initializeWebPages() {
		objDesignFlow = new DesignFlow(this);
	//	objLoginLogoutFlow = new LoginLogoutFlow(this);

	}

/*	@Test(priority = 1, groups = "smoke")
	public void TCID_001_VerifyHomePageDisplayed() {

		objLoginLogoutFlow.doLogin();
		} */

	@Test(priority = 3, groups = {"functional", "smoke"})
	public void TCID_003_VerifyDesignPageIsDisplayed() {

		this.setImplicitWait(5000);
		objDesignFlow.selectDesignType();
		System.out.println("TestCase Priority 3 is executed ");
	}

	
}
