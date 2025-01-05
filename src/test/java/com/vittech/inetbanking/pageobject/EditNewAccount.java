package com.vittech.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EditNewAccount {

	WebDriver driver;

	public EditNewAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
