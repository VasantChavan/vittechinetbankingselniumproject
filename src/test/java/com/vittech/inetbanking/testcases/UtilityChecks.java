package com.vittech.inetbanking.testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vittech.inetbanking.testbase.TestBase;
import com.vittech.inetbanking.utility.Helper;

public class UtilityChecks extends TestBase{
	
	
	
	
	@Test(enabled = false)
	public void selectDropdownValue()
	{
		driver.findElement(By.linkText("Sign Up")).click();
		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		
		Helper.handleDropdown(day, 25); // By using index
		Helper.handleDropdown("1", month); // by using value
		Helper.handleDropdown(year, "2010"); // By using visible text
		
	
		if(Helper.validateDropdownOptions(month, "Dec"))
		{
			System.out.println("The option is available in the dropdown");
		}
		else
		{
			System.out.println("The option is not available in the dropdown");
		}
		
	}
	
	@Test
	public void handleWindows() throws InterruptedException
	{
//		System.out.println(driver.getTitle());
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		System.out.println(driver.getTitle());
//		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
		
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")).click();
		
		
		
		//OrangeHRM
		//OrangeHRM Inc - YouTube
		//X
		//OrangeHRM | LinkedIn
		//OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook
		
		Set<String> winIds = driver.getWindowHandles();
		
		Helper.handleMultipleWindow(winIds, driver,"OrangeHRM Inc - YouTube");
		Helper.handleMultipleWindow(winIds, driver,"OrangeHRM");
		
		
		
	}
	

}
