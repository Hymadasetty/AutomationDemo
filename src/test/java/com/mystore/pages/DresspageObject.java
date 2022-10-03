package com.mystore.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DresspageObject {

	public WebDriver driver;

	@FindBy(xpath = "(//div[@class=\"product-container\"])[2]")
	WebElement image;
	
	@FindBy(xpath = "(//div[@class=\"button-container\"])[3]")
	WebElement addtocart;
	
	@FindBy(xpath = "//a[@title=\"Proceed to checkout\"]")
	WebElement proceedtocheout;

	public DresspageObject(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void scrollDownByPixels(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver; // Explicit Type Casting
		js.executeScript("window.scrollBy(0,1000)");

	}

	public void clickonaddtocart(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(image).perform();

	}

	public void addtocart() {

		addtocart.click();
	}

	public void proceedtocheckout() {
		proceedtocheout.click();

	}

}