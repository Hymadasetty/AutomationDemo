package com.mystore.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccoutPageObject {

	public WebDriver driver;

	@FindBy(xpath = "//h1[@class=\"page-heading\"]")
	WebElement pageHeading;

	@FindBy(xpath = "(//a[text()=\"Dresses\"])[2]")
	WebElement Dresses;



	public MyAccoutPageObject(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {

		return pageHeading.getText();
	}

	public void clickonHome() {
		Dresses.click();
	}





	}


		
	
	
	

