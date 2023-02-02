package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class ThirdTest extends BaseClass{
	
	@Test
	public void thirdTest() throws InterruptedException  {
		SoftAssert soft = new SoftAssert();
		
		home.SearchCourse("Core java for Selenium");
		soft.assertTrue(coreJava.getPageHeader().isDisplayed());
		coreJava.clickCoreJavaLink();
		soft.assertTrue(javaDemo.getPageHeader().isDisplayed());
		web.switchToFrame(0);
		javaDemo.clickPlayButton();
		Thread.sleep(3000);
		javaDemo.clickPauseButton();
		javaDemo.clickAddToWishList();
		
		soft.assertAll();
	}
}
