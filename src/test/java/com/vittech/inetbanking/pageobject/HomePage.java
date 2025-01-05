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

	@FindBy(linkText = "New Account")
	@CacheLookup
	WebElement newAccountLink;

	@FindBy(linkText = "Edit Account")
	@CacheLookup
	WebElement editAccountLink;

	@FindBy(linkText = "Delete Account")
	@CacheLookup
	WebElement deleteAccountLink;

	@FindBy(linkText = "Log out")
	@CacheLookup
	WebElement logoutLink;

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateManagerLinkIsDisplayed() {

		boolean status = false;
		try {
			Thread.sleep(3000);
			status = manager_Link.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean validateNewCustomerLinkIsDisplayed() {

		boolean status = false;
		try {
			Thread.sleep(3000);
			status = newCustomerLink.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean validateEditCustomerLinkIsDisplayed() {

		boolean status = false;
		try {
			Thread.sleep(3000);
			status = editCustomerLink.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean validateDeleteCustomerLinkIsDisplayed() {

		boolean status = false;
		try {
			Thread.sleep(3000);
			status = deleteCustomerLink.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean validateNewAccountLinkIsDisplayed() {

		boolean status = false;
		try {
			Thread.sleep(3000);
			status = newAccountLink.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean validateEditAccountLinkIsDisplayed() {

		boolean status = false;
		try {
			Thread.sleep(3000);
			status = editAccountLink.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean validateDeleteAccountLinkIsDisplayed() {

		boolean status = false;
		try {
			Thread.sleep(3000);
			status = deleteAccountLink.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public boolean validateLogoutLinkIsDisplayed() {

		boolean status = false;
		try {
			Thread.sleep(3000);
			status = logoutLink.isDisplayed();
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
	
	public NewCustomerPage navigateToNewCustomerPage() {
		try {
			newCustomerLink.click();
			return new NewCustomerPage(driver);

		} catch (Exception e) {
			e.printStackTrace();
			return new NewCustomerPage(driver);
		}
	}
	
	public EditCustomerPage navigateToEditCustomerPage() {
		try {
			editCustomerLink.click();
			return new EditCustomerPage(driver);

		} catch (Exception e) {
			e.printStackTrace();
			return new EditCustomerPage(driver);
		}
	}
	
	public DeleteCustomerPage navigateToDeleteCustomerPage() {
		try {
			deleteCustomerLink.click();
			return new DeleteCustomerPage(driver);

		} catch (Exception e) {
			e.printStackTrace();
			return new DeleteCustomerPage(driver);
		}
	}

	public NewAccountPage navigateToNewAccountPage() {
		try {
			newAccountLink.click();
			return new NewAccountPage(driver);

		} catch (Exception e) {
			e.printStackTrace();
			return new NewAccountPage(driver);
		}
	}
	
	public EditAccountPage navigateToEditAccountPage() {
		try {
			editAccountLink.click();
			return new EditAccountPage(driver);

		} catch (Exception e) {
			e.printStackTrace();
			return new EditAccountPage(driver);
		}
	}
	
	public DeleteAccountPage navigateToDeleteAccountPage() {
		try {
			deleteAccountLink.click();
			return new DeleteAccountPage(driver);

		} catch (Exception e) {
			e.printStackTrace();
			return new DeleteAccountPage(driver);
		}
	}

}
