package com.vstl.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.vstl.Generic.Pojo;

public class RulesManagerPage {

	private Pojo objPojo;

	public RulesManagerPage(Pojo pojo) {
		this.objPojo = pojo;
	}

	By loc_clkRulesManager = By.id("rulesmanager");
	By loc_drpDocumentDesign = By.xpath("//select[@id='drpFormDesign']");
	By loc_drpDocumentDesignVersion = By.xpath("//select[@id='drpFormDesignVersion']");
	By loc_drpViewType = By.xpath("//select[@id='drpViewType']");
	By loc_txtRuleManagerList = By.xpath("//span[text()='Rule Master List']");

	public void clickRulesManagerFromLeftSideMenu() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().clickEvent(loc_clkRulesManager));
	}

	public String verifyRulesManagerTextIsDisplyed() {
		
		String strnReturnValue = String.valueOf(objPojo.getObjSeleniumWrapperFunctions().getText(loc_clkRulesManager));
		return strnReturnValue;
	}
	
	public void selectBusinessFromDocumentDesign() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().selectDropDown(loc_drpDocumentDesign, "Business"));
	}
	
	public void selectDropDownDocumentDesignVersion() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().selectDropDown(loc_drpDocumentDesignVersion, "1.0"));
	}

	public void selectDropDownViewType() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().selectDropDown(loc_drpViewType, "By Rule"));
	}

	public String verifyRuleMasterListTextIsDisplayed() {
		
		String strReturnValue = String.valueOf(objPojo.getObjSeleniumWrapperFunctions().getText(loc_txtRuleManagerList));
		return strReturnValue;
	}
	
}
