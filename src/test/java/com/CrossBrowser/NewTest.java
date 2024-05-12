package com.CrossBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewTest {
	
	
	public WebDriver driver;
	@Parameters({"name"})
	 @Test
  public void CrossBrowser(String name) throws MalformedURLException {
	  
	  if (name.equalsIgnoreCase("chrome")) {
		  ChromeOptions op= new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
		  driver.get("https://www.amazon.in/");
		  
	  }
	 
	else if(name.equalsIgnoreCase("edge")){
		 EdgeOptions op= new EdgeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
		  driver.get("https://www.amazon.in/");
	  }
	else if (name.equalsIgnoreCase("firefox")) {
		 FirefoxOptions op= new FirefoxOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
		  driver.get("https://www.amazon.in/");
		
	}
	  System.out.println(driver.getTitle());
	  
	  
  }
}
