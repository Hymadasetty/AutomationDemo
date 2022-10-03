package com.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPageObjects {

	
	@FindBy(xpath = "//div[@id=\"center_column\"]/child::h1")
	private WebElement contactUsTitle;
	
	@FindBy(xpath = "//select[@id=\"id_contact\"]")
	private WebElement subjectHeadingDD;
	
	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement email ;
	
	@FindBy(xpath = "//select[@name=\"id_order\"]")
	private WebElement orderRef ;
	
	@FindBy(xpath = "//textarea[@id=\"message\"]")
	private WebElement message ;
	
	@FindBy(xpath = "//button[@name=\"submitMessage\"]")
	private WebElement sendBtn ;
	
	@FindBy(xpath = "//p[@class=\"alert alert-success\"]")
	private WebElement verificationMessage;
	
	public ContactUsPageObjects(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String getPageTitle() {

		String text = contactUsTitle.getText();
		return text;
	}

	public boolean verifyTitle(String title) {

		boolean status = contactUsTitle.getText().contains(title);
		return status;
	}

	public void chooseSubjectHeading(String option) {

		Select s = new Select(subjectHeadingDD);
		s.selectByVisibleText(option);
	}

	public void setEmail(String emailAddress) {
		email.clear();
		email.sendKeys(emailAddress);
	}

	public void setOrderRef(String order) {
	Select s	 = new Select(orderRef);
	s.selectByVisibleText(order);
	}

	public void enterMessage(String msg) {

		message.sendKeys(msg);
	}

	public void clickSendBtn() {
		sendBtn.click();
	}

	public boolean verifySuccessMessage(String msg) {

		boolean status = verificationMessage.getText().contains(msg);
		return status;
	}
	
}


