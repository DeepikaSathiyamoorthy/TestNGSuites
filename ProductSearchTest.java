package com.vstl.scripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vstl.Generic.BaseTest;
import com.vstl.PageFactory.ProductSearchPage;

public class ProductSearchTest extends BaseTest {
	private ProductSearchPage objProductSearchPage;
	
	public void initializeWebPages() {
		objProductSearchPage = new ProductSearchPage(this);
	}
	
	@Parameters("strKeywordToSearch")
	@Test(priority = 5, groups = {"Regression", "Functional"})
	public void TCID_005_VerifySearchListOnProductSearch() {
		
		String strKeywordToSearch = null;
		objProductSearchPage.openProductSearch();
		objProductSearchPage.typeInSearchBoxOnProductSearchBox(strKeywordToSearch);
		objProductSearchPage.clickOnSearchButtonOnProductSearchPage();
	}
		
}
