package com.vittech.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount {

	WebDriver driver;

	public CreateNewAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
