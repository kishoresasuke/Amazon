package com.CRMPageTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.CRMPage.Homepage;
import com.CRMPage.LoginPage;

public class BaseClass {
	WebDriver driver;
	Homepage hp;
	LoginPage lp;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		hp= new Homepage(driver);
	    lp=new LoginPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");
	}
	
	@BeforeClass

	public void CrmLogin() {
		hp.sigIn();
	}
}
