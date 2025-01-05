package com.vittech.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Home page repository

	@FindBy(linkText = "Manager")
	@CacheLookup
	WebElement manager_Link;

	@FindBy(linkText = "New Customer")
	@CacheLookup
	WebElement newCustomerLink;

	@FindBy(linkText = "Edit Customer")
	@CacheLookup
	WebElement editCustomerLink;

	@FindBy(linkText = "Delete Customer")
	@CacheLookup
	WebElement deleteCustomerLink;

	@FindBy(linkText = "Log out")
	@CacheLookup
	WebElement logoutLink;

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateManagerLinkIsDisplayed() {
		
		boolean status=false;
		try {
			Thread.sleep(3000);
			status=manager_Link.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public ManagerPage navigateToManagerPage() {
		try {
			manager_Link.click();
			return new ManagerPage(driver);

		} catch (Exception e) {
			e.printStackTrace();
			return new ManagerPage(driver);
		}
	}

}
