package com.vstl.flows;

import com.vstl.Generic.Pojo;
import com.vstl.PageFactory.RulesManagerPage;

public class RulesManagerFlow {

	private Pojo objPojo;
	private RulesManagerPage objRulesManagerPage;
	
	public RulesManagerFlow(Pojo pojo) {
		this.objPojo=pojo;
		objRulesManagerPage = new RulesManagerPage(objPojo);
	}
	
	public void selectRulesManager() {
		
		objRulesManagerPage.clickRulesManagerFromLeftSideMenu();
		objRulesManagerPage.selectBusinessFromDocumentDesign();
		objRulesManagerPage.selectDropDownDocumentDesignVersion();
		objRulesManagerPage.selectDropDownViewType();
	}
	
}
