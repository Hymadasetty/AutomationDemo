package com.mystore.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderMystore {

	public WebDriver driver;

	@FindBy(xpath = "//table[@id=\"cart_summary\"]/tfoot/child::tr")
	List<WebElement> lists;

	@FindBy(xpath = "(//a[@title=\"Proceed to checkout\"])[2]")
	WebElement proceed;

	@FindBy(xpath = "//button[@name=\"processAddress\"]")
	WebElement procetochck;

	@FindBy(xpath = "//div[@class=\"checker\"]")
	WebElement check;

	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	WebElement finalcheckout;

	@FindBy(xpath = "//a[@class=\"cheque\"] ")
	WebElement paybycheck;

	@FindBy(xpath = "(//button[@type=\"submit\"])[2] ")
	WebElement confirmmyorder;
	@FindBy(xpath = "//p[@class=\"alert alert-success\"]")
	WebElement orderconfirmmsg;

	public OrderMystore(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void tabledata() {

		for (WebElement list : lists) {

			System.out.println(list.getText());

		}
	}

	public void procedtochckot() {

		proceed.click();
	}

	public void procetochckot() {
		procetochck.click();

	}

	public void checkbox() {

		check.click();
		;
	}

	public void finalproceedcheckout() {
		finalcheckout.click();

	}

	public void PayByCheck() {

		paybycheck.click();
	}

	public void iconfirmmyorder() {

		confirmmyorder.click();
	}

	public boolean verifySuccessMessage(String msg) {

		boolean status = orderconfirmmsg.getText().contains(msg);
		return status;
	}
}