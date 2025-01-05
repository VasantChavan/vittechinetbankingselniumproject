package com.vittech.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ManagerPage {

	
	WebDriver driver;
	
	public ManagerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Manager Page Object Repository
	
	@FindBy(xpath="//marquee[@class='heading3']")
	@CacheLookup
	WebElement manageralText;
	
	
	
	public String validateManagerWelcomeText()
	{
		return manageralText.getText();
	}
	
}
