package com.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPageObjects {

	@FindBy(xpath = "(//label[text()=\"Email address\"])[2]/following-sibling::input")
	WebElement loginEmail;
	
	@FindBy(xpath = "//input[@id=\"passwd\"]")
	WebElement password;
	
	@FindBy(id = "SubmitLogin")
	WebElement signInBtn;
	
	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLoginEmail(String email) {
		loginEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickSignInBtn() {
		signInBtn.click();
	}
	
	public void login(String email, String pwd) {
	
		this.setLoginEmail(email);
		this.setPassword(pwd);
		this.clickSignInBtn();
	}
	
}
