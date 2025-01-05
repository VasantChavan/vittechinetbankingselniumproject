package com.vittech.inetbanking.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.vittech.inetbanking.utility.ConfigDataProvider;
import com.vittech.inetbanking.utility.ExcelDataProvider;

public class TestBase {

	public static WebDriver driver;
	public static ConfigDataProvider configDataProvider;
	public static ExcelDataProvider excelDataProvider;
	
	
	@BeforeSuite
	public void init()
	{
		configDataProvider=new ConfigDataProvider("prop");
		excelDataProvider = new ExcelDataProvider("mytestdata");
	}

	//@BeforeMethod
	@BeforeTest
	public void setUP() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.guru99.com/V1/index.php");
		
		driver.get(configDataProvider.getAappURL());	
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	//@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
