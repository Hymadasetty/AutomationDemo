package com.mystore.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mystore.pages.ContactUsPageObjects;
import com.mystore.pages.DresspageObject;
import com.mystore.pages.LoginPageObjects;
import com.mystore.pages.MyAccoutPageObject;
import com.mystore.pages.MyStorePageObjects;
import com.mystore.pages.OrderMystore;

public class TestBase {

	public static WebDriver driver;
	public MyStorePageObjects msp;
	public ContactUsPageObjects cup;
	public LoginPageObjects lp;
	public MyAccoutPageObject map;
	public DresspageObject dsp;
public OrderMystore oms;
	@BeforeMethod()
	public void setUp() {

		String projectLocation = System.getProperty("user.dir");
		System.out.println("Project Location : " + projectLocation);
		System.setProperty("webdriver.chrome.driver", "./BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");

		msp = new MyStorePageObjects(driver);
		cup = new ContactUsPageObjects(driver);
		lp = new LoginPageObjects(driver);
		map = new MyAccoutPageObject(driver);
		dsp = new DresspageObject(driver);
        oms = new OrderMystore(driver);
	}

	@AfterMethod()
	public void tearDown() {
		// driver.close();
	}

}
