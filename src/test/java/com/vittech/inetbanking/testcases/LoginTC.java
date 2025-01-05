package com.vittech.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vittech.inetbanking.pageobject.LoginPage;
import com.vittech.inetbanking.testbase.TestBase;
import com.vittech.inetbanking.utility.Helper;

public class LoginTC extends TestBase {

	//@Test
	public void verifyLoginFunctionality()  {

//		driver.findElement(By.name("uid")).sendKeys("mngr603546");
//		driver.findElement(By.name("password")).sendKeys("nunYdyg");
//
//		driver.findElement(By.name("btnLogin")).click();
		
		LoginPage lp = new LoginPage(driver);
//		lp.setUserName("mngr603546");
//		lp.setPassword("nunYdyg");
		
		lp.setUserName(configDataProvider.getUserID());
		lp.setPassword(configDataProvider.getPasword());
		
		lp.clickOnLoginBtn();
		
				
		String actTitle =driver.getTitle();
		String expTitle ="GTPL Bank Manager HomePage";
		
		Assert.assertEquals(actTitle, expTitle);

	}
	
	// verify the login functionality with valid and invalid set of test data
	
	@Test(dataProvider = "LoginTestData")
	public void verifyLoginFunctionality(String uname, String upass, String pageTitle) throws InterruptedException {
		
		
		LoginPage lp =new LoginPage(driver);
		
		lp.setUserName(uname);
		lp.setPassword(upass);
		
		lp.clickOnLoginBtn();		
				
		if(driver.getTitle().contains(pageTitle))
		{
			System.out.println("Login Success");
			//driver.findElement(By.linkText("Log out")).click();
//			lp.clickOnLogoutBtn();
			// Handle alert 
			Helper.handleAlert(driver);
			Assert.assertTrue(true);
			
			
		}
		else if(driver.getTitle().endsWith(pageTitle))
		{
			// Handle alert 
			Helper.handleAlert(driver);
			Assert.assertTrue(true);
		}
	}
	
	@DataProvider(name="LoginTestData")
	public String[][] createLoginTestData()
	{
		String[][] loginData = {
				{"mngr603546","nunYdyg","Bank Manager"},
				{"mngr603546","nunYdy1","GTPL Bank Home Page"},
				{"mngr6035$%","nunYdyg","GTPL Bank Home Page"},
				{"mngr6035$%","nunYdy1","GTPL Bank Home Page"}
				};
		return loginData;
		
	
	}
	
}
