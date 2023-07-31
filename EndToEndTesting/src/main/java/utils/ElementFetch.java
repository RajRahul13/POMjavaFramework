package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.baseTest;

public class ElementFetch {
	public WebElement getWebElement(String identifierType,String indentifierValue) {
		switch (identifierType) {

		case "XPATH":
			return baseTest.driver.findElement(By.xpath(indentifierValue));

		case "CSS":
			return baseTest.driver.findElement(By.cssSelector(indentifierValue));

		case "ID":
			return baseTest.driver.findElement(By.id(indentifierValue));

		case "NAME":
			return baseTest.driver.findElement(By.name(indentifierValue));

		case "TAG":
			return baseTest.driver.findElement(By.tagName(indentifierValue));

		default:
			return null;
		}
	}
		
		public List<WebElement> getWebElements(String identifierType,String indentifierValue) {
			switch (identifierType) {

			case "XPATH":
				return baseTest.driver.findElements(By.xpath(indentifierValue));

			case "CSS":
				return baseTest.driver.findElements(By.cssSelector(indentifierValue));

			case "ID":
				return baseTest.driver.findElements(By.id(indentifierValue));

			case "NAME":
				return baseTest.driver.findElements(By.name(indentifierValue));

			case "TAG":
				return baseTest.driver.findElements(By.tagName(indentifierValue));

			default:
				return null;
			}
	}

}
