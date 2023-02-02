package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	
	//Declaration 
	@FindBy(xpath="//h2[text()='core java for selenium']")
	private WebElement pageHeader;
	
	@FindBy(linkText="Core Java for Selenium Trainin")
	private WebElement coreJavaLink;
	
	//Initialization
	public CoreJavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getPageHeader() {
		return getPageHeader();
	}
	
	public void clickCoreJavaLink() {
		coreJavaLink.click();;
	}

}
