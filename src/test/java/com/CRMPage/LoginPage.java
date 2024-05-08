package com.CRMPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By email=By.id("email-id");
	By pass=By.id("password");
	By btn=By.id("submit-id");
	
	
	public void Login(String us, String ps) {
		driver.findElement(email).sendKeys(us);
		driver.findElement(pass).sendKeys(ps);
		driver.findElement(btn).click();
	}

}
