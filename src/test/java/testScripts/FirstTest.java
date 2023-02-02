package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class FirstTest extends BaseClass {
	
	@Test
	public void firstTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		demoApp.mouseHoverTocourseTab(web);
		demoApp.clickSeleniumtraining();
		soft.assertTrue(selenium.getPageHeader().isDisplayed());
		selenium.doubleClickPlusButton(web);
		selenium.clickAddtoCart();
		web.handleAlert();
		web.screenshot();
		soft.assertAll();
		
	}

}
