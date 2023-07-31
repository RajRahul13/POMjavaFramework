package qa.tests;

import org.testng.annotations.Test;

import base.baseTest;
import pageEvents.HomepageEvents;
import pageEvents.SigninPageEvents;

public class Testcase1 extends baseTest{
  
  SigninPageEvents signInPage = new SigninPageEvents();
  HomepageEvents homePage = new HomepageEvents();
  
  @Test
  public void SamplemethodforenterinCred() {
	 homePage.HomePageLoginBTNclick();
	 signInPage.verifyLoginPageisLoaded();
	 signInPage.entering_cred();  
  }
}
