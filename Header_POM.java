package pomitlearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header_POM {
	
	static WebDriver driver;
	
	@FindBy(className = "xpro-button-text")
	private WebElement AllCourses;

	public Header_POM(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getAllCourses() {
		return AllCourses;
	}
	
	@FindBy(xpath = "//img[@fetchpriority='high']")
	private WebElement logo;

	public WebElement getLogo() {
		return logo;
	}
	
	@FindBy(xpath = "//span[text()='Blog']")
     private WebElement Blog;

	public WebElement getBlog() {
		return Blog;
	}
	
	@FindBy(xpath = "//span[text()='Contact US']")
	private WebElement Contact;

	public WebElement getContact() {
		return Contact;
	}
	
	@FindBy(xpath = "//span[text()='My Dashboard']")
	private WebElement Dashboard;

	public WebElement getDashboard() {
		return Dashboard;
	}
		
		
}
