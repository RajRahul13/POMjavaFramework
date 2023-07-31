package pageEvents;

import org.testng.Assert;

import pageObjects.SigninPageObjects;
import utils.ElementFetch;

public class SigninPageEvents {
	ElementFetch ele = new ElementFetch();
	public void verifyLoginPageisLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", SigninPageObjects.SignInPageLoginBTN).size()>0,"Element not found");	
	}
	
	public void entering_cred() {
		ele.getWebElement("XPATH", SigninPageObjects.SignInPageEmailTxtBox).sendKeys("rahul12rai13@gmail.com");
		ele.getWebElement("XPATH", SigninPageObjects.SignInPagePasswordTxtBox).sendKeys("Lionking@01");
	}
}
