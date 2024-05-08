package com.CRMPageTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
	
	
  @Test(priority = 1)
  public void VerifyURL() {
	System.out.println(hp.getUrl());
	  Assert.assertTrue(hp.getUrl().contains("crm"),"WrongURL");
	  System.out.println("Currect URL");
  }
  @Test(priority = 2)
  public void VerifyTitle() {
	  String Title=hp.getTitle();
	  Assert.assertTrue(Title.contains("Customer"),"Wrong Title");
	  System.out.println("Currect Title");
  }
  @Test(priority = 3)
  public void VerifySignin() {
	  hp.sigIn();
	  Assert.assertTrue(hp.getUrl().contains("login"), "WrongURL");
	  System.out.println("CorrectURL");
  }
}
