package com.vittech.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteNewAccount {

	WebDriver driver;

	public DeleteNewAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
