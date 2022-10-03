package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.base.TestBase;



public class ContactUsTestCases extends TestBase {

	@Test(priority = 1)
	public void verifySendAMessage() {
		
		
		Assert.assertTrue(msp.verifyContactUsLinkIsEnabled(), "Unbale to click contactUs link");
		msp.clickContactus();
		System.out.println("Click on ContactUs link");
		
		System.out.println("Veriy CUSTOMER SERVICE - CONTACT US title is displayed");
		
		System.out.println("GET PAGE TITLE " + cup.getPageTitle());
		
		Assert.assertTrue(cup.verifyTitle("CUSTOMER SERVICE - CONTACT US"));
		
		System.out.println("Choose Subjectheading ");
		cup.chooseSubjectHeading("Webmaster");
		
		System.out.println("Enter Email address");
		cup.setEmail("dcqadevops@gmail.com");
		
		System.out.println("Enter Order Reference");
		cup.setOrderRef("TUUOONHHT - 12/06/2021");
		
		System.out.println("Add message");
		cup.enterMessage("Order not received");
		
		System.out.println("Click on Send button");
		cup.clickSendBtn();
		
		Assert.assertTrue(cup.verifySuccessMessage("Your message has been successfully sent to our team."), "Send message not succesful");
	}
	
	
}
	
	

