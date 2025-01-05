package com.vittech.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Local repository

	@FindBy(name = "uid")
	@CacheLookup
	WebElement username_txt;

	@FindBy(name = "password")
	@CacheLookup
	WebElement passwordtxt;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement loginBtn;
	
	@FindBy(name = "btnReset")
	@CacheLookup
	WebElement resetBtn;
	

	public void setUserName(String username) {

		try {
			username_txt.sendKeys(username);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void setPassword(String pass) {
		try {
			passwordtxt.sendKeys(pass);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public HomePage clickOnLoginBtn() {
		try {
			loginBtn.click();
		} catch (Exception e) {
			System.out.println(e);
		}
		return new HomePage(driver);
	}
	
	public void clickOnResetBtn() {
		try {
			resetBtn.click();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
}
