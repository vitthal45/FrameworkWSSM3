package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	
	//Declaration
	@FindBy(xpath="//a[contains(.,'-ECommerce')]") private WebElement pageheader;
	@FindBy(id="course") private WebElement courseTab;
	@FindBy(xpath="//span[@class='wrappers']/a[.='Selenium Training']") private WebElement seleniumTraningLink;
	@FindBy(name="addresstype") private WebElement categoryDropdown;
	@FindBy(xpath="//a[.='Contact Us']") private WebElement contactUslink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	//Utilization
	public WebElement getPageHeader() {
		return pageheader;
	}
	
	public void mouseHoverTocourseTab(WebDriverUtility web) {
		web.mouseHover(courseTab);	
	}
	
	public void clickSeleniumtraining() {
		seleniumTraningLink.click();
	}
	
	public void selectCategory(WebDriverUtility web, int index) {
		web.dropdown(categoryDropdown, index);
	}
	
	public WebElement getContactUsLink() {
		return contactUslink;
	}
	
	public void clickContactUs() {
		contactUslink.click();
	}

}
