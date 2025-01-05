package com.vittech.inetbanking.utility;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Helper {

	public static void handleDropdown(WebElement dropdown, String visibleTxt) {
		new Select(dropdown).selectByVisibleText(visibleTxt);
	}

	public static void handleDropdown(String value, WebElement dropdown) {
		new Select(dropdown).selectByValue(value);
	}

	public static void handleDropdown(WebElement dropdown, int index) {
		new Select(dropdown).selectByIndex(index);
	}
	
	public static boolean validateDropdownOptions(WebElement dropdown, String value)
	{
		List<WebElement> options = new Select(dropdown).getOptions();

		boolean status = false;
		for (WebElement option : options) {
			if(option.getText().equals(value))
			{
				status =true;
				break;
			}
		}

		return status;

	}
	
	public static void handleAlert(WebDriver driver)
	{
		if(isAlertPreset(driver))
		{
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Alert is not present on the page hence ignored");
		}
		
	}	
	public static boolean isAlertPreset(WebDriver driver)
	{
		try {
			driver.switchTo().alert();
			return true;
			
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	public static void handleMultipleWindow(Set<String> winIds, WebDriver driver,String winTitle) {

		for (String window : winIds) {
			if (driver.switchTo().window(window).getTitle().equals(winTitle)) {
				System.out.println(driver.getTitle());
				driver.close();
				break;
			}

		}
	}
	

}
