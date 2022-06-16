package com.vstl.flows;

import com.vstl.Generic.Pojo;
import com.vstl.PageFactory.DesignPage;

public class DesignFlow {

	private Pojo objPojo;
	private DesignPage objDesignPage;
	//private LoginLogoutFlow objLoginLogoutFlow;
	
	public DesignFlow(Pojo pojo) {
		this.objPojo=pojo;
		objDesignPage = new DesignPage(objPojo);
		//objLoginLogoutFlow = new LoginLogoutFlow(objPojo);
		
	}
	
	public void selectDesignType() {
		
		objDesignPage.clickDesignSHC();
		objDesignPage.verifyDesignTextisDisplayedOnDesignPage();
		objDesignPage.selectDesignTypeAnchor();
		objDesignPage.selectDesignTypeCollateral();
		objDesignPage.selectDesignTypeMasterList();
		objDesignPage.selectDesignTypeView();
	}
	
	
}
