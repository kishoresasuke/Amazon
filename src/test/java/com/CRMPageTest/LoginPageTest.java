package com.CRMPageTest;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
  @Test
  public void VerifyLogin() {
	hp.sigIn();
	  lp.Login("Kishore@gamil.com", "Kishore123");
  }
}
