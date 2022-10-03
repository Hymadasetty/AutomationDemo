package testcasesforlistners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDEmo {

	@Test
	public void testcase_1() {
		
		System.out.println("This is test case 1");
	
		Assert.assertTrue(true);
	}


	@Test
	public void testcase_2() {
		
		System.out.println("This is test case 2");
		Assert.assertTrue(false);
	}



	@Test(dependsOnMethods = "testcase_2")
	public void testcase_3() {
		
		System.out.println("This is test case 3");
	}













}
