package com.vittech.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vittech.inetbanking.pageobject.LoginPage;
import com.vittech.inetbanking.testbase.TestBase;
import com.vittech.inetbanking.utility.Helper;

public class LoginTC01 extends TestBase {

	
	
	//@Test
	public void validateLoginFunctionality()
	{
		try {
			LoginPage lp = new LoginPage(driver);
			String username = excelDataProvider.getCellData("login", 1, 0);
			String passwrd = excelDataProvider.getCellData("login", 1, 1);
			
			String expTitle = excelDataProvider.getCellData("login", 1, 2);
			
			lp.setUserName(username);
			lp.setPassword(passwrd);
			
			lp.clickOnLoginBtn();
			
			Thread.sleep(3000);
			
			Assert.assertEquals(driver.getTitle(), expTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test(dataProvider = "LoginTestData")
	public void verifyLoginFunctionality(String uname, String upass, String pageTitle) throws InterruptedException {
		
		
		LoginPage lp =new LoginPage(driver);
		
		lp.setUserName(uname);
		lp.setPassword(upass);
		
		lp.clickOnLoginBtn();	
		
		Thread.sleep(3000);
		
		Helper.handleAlert(driver);
		
		Assert.assertEquals(driver.getTitle(), pageTitle);
	}
	
	@DataProvider(name="LoginTestData")
	public String[][] createLoginTestData()
	{
		return excelDataProvider.getCellTestData("datadriven");
	}
	
}
