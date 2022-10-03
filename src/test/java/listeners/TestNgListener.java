package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mystore.base.TestBase;

public class TestNgListener extends TestBase implements ITestListener {

	@Override

	public void onStart(ITestContext context) {
System.out.println("==> Test Execution started");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("==> Test Execution finished");
	}	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("==> Execute the test case " + result.getName());
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		capturescreenshot(result.getMethod().getMethodName());
		
		System.out.println("Screenshot has been taken");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("==> Skipped following test case " + result.getName());
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("==> Successfully executed the following test case" + result.getName());
		ITestListener.super.onTestSuccess(result);
	}
	
	public static void capturescreenshot(String hyma) {
	
		TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File Target = new File("ABC",hyma+".png");
	
	try {
		FileUtils.copyFile(source,Target);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}
	
	
	
}





