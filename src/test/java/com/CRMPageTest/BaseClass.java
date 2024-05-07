package com.CRMPageTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.CRMPage.Homepage;

public class BaseClass {
	WebDriver driver;
	Homepage hp;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		hp= new Homepage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");
	}
	

}
