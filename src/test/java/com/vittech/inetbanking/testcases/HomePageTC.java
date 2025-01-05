package com.vittech.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vittech.inetbanking.pageobject.HomePage;
import com.vittech.inetbanking.pageobject.LoginPage;
import com.vittech.inetbanking.pageobject.ManagerPage;
import com.vittech.inetbanking.testbase.TestBase;

public class HomePageTC extends TestBase {

	HomePage hm;

	@Test(priority = 1)
	public void validateUserLandedOnHomePage() {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(configDataProvider.getUserID());
		lp.setPassword(configDataProvider.getPasword());

		hm = lp.clickOnLoginBtn();

		Assert.assertTrue(hm.validateManagerLinkIsDisplayed());
	}

	@Test(priority = 2)
	public void homePageTitleTC() {

		Assert.assertEquals(hm.validateHomePageTitle(), "GTPL Bank Manager HomePage",
				"Actual & Expected Title diesn't matched , might be user is not loggedin successfully!!!");

	}
	
	@Test(priority = 3)
	public void clickOnManagerLink()
	{
		ManagerPage mp = hm.navigateToManagerPage();
		Assert.assertEquals(mp.validateManagerWelcomeText(),"Welcome To Manager's Page of GTPL Bank");
		
	}

}
