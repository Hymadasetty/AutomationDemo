package com.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStorePageObjects {

	@FindBy(xpath = "//a[@title='Contact Us']")
	WebElement contactUsLink;
	
	@FindBy(xpath = "//a[@class=\"login\"]")
	WebElement signIn;
	
	public MyStorePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactUsLinkIsEnabled() {
		boolean status = contactUsLink.isDisplayed();
		return status;
	}
	
	public void clickContactus() {
		
		contactUsLink.click();
	}
	
	public void clickSignIn() {
		signIn.click();
	}

}

