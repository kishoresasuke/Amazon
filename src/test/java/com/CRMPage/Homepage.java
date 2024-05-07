package com.CRMPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	private WebDriver driver;

	public Homepage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String  getUrl() {
		 return driver.getCurrentUrl();
	}
	public String getTitle() {
		 return driver.getTitle();
	}
	
	public void sigIn() {
		driver.findElement(By.id("SignIn")).click();

	}
}
