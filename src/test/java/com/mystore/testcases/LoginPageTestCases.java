package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.base.TestBase;

public class LoginPageTestCases extends TestBase {

	@Test(priority = 2)
	public void verifyLogin() {

		msp.clickSignIn();
		lp.login("dcqadevops@gmail.com", "digitalcutlet");

		System.out.println("Page title is " + map.getPageTitle());

		Assert.assertTrue(map.getPageTitle().contains("MY ACCOUNT"));

		System.out.println("click on dresses");
		map.clickonHome();

		System.out.println("scroll down");
		dsp.scrollDownByPixels(driver);

		System.out.println("selected item to cart");
		dsp.clickonaddtocart(driver);

		System.out.println("item added to cart");
		dsp.addtocart();
		Assert.assertTrue(false);

		System.out.println("first proceed to checkout");
		dsp.proceedtocheckout();

		System.out.println("print table data");
		oms.tabledata();

		System.out.println("second proceed to checkout");
		oms.procedtochckot();

		System.out.println("third proceed to checkout");
		oms.procetochckot();
		System.out.println("check the box");
		oms.checkbox();

		System.out.println("final proceed to checkout");
		oms.finalproceedcheckout();

		System.out.println("payment can be done by check");
		oms.PayByCheck();

		System.out.println("confirmed order");
		oms.iconfirmmyorder();
		Assert.assertTrue(oms.verifySuccessMessage("Your order on My Store is complete"),
				"order confirm msg not succesful");

	}

}
