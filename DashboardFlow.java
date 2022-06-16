package com.vstl.flows;

import com.vstl.Generic.Pojo;
import com.vstl.PageFactory.DashboardPage;

public class DashboardFlow {
	
	private Pojo objPojo;
	private DashboardPage objDashboardPage;
	
	

	public DashboardFlow(Pojo pojo) {
		this.objPojo = pojo;
		objDashboardPage = new DashboardPage(objPojo);
	}

	public void openeBSConfigportfolio() {
		objDashboardPage.clickeBsConfigPortfolio();
		objPojo.setIntImplicitWait(10000);
	//	objPojo.getDriver().navigate().back();
		
	}

	public void openPremeraProduct() {
		objDashboardPage.clickPremeraProduct();
		objPojo.setIntImplicitWait(10000);
		//objPojo.getDriver().navigate().back(); 
	}
}

