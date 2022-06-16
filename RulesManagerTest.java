package com.vstl.scripts;

import org.testng.annotations.Test;

import com.vstl.Generic.BaseTest;
import com.vstl.flows.RulesManagerFlow;

public class RulesManagerTest extends BaseTest {

	private RulesManagerFlow objRulesManagerFlow;

	public void initializeWebPages() {
		objRulesManagerFlow = new RulesManagerFlow(this);

	}

	@Test(priority = 4, groups = "functional")
	public void TCID_004_VerifyRulesManagerPageIsDisplayed() {

		this.setIntImplicitWait(10000);
		objRulesManagerFlow.selectRulesManager();
		System.out.println("TestCase Priority 4 is Executed");
	}
}
