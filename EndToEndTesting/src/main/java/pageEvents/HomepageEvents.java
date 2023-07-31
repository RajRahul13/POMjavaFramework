package pageEvents;

import pageObjects.HomepageObjects;
import utils.ElementFetch;

public class HomepageEvents {
	ElementFetch ele = new ElementFetch();
	
	public void HomePageLoginBTNclick() {
		ele.getWebElement("XPATH", HomepageObjects.HomePageLoginBTN).click();
	}

}
