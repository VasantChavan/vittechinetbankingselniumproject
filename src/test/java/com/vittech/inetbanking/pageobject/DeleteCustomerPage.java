package com.vittech.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
	WebDriver driver;

	public DeleteCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
