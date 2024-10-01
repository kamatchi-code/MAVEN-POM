package pomitlearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coursesmousehover_POM {
	
	static WebDriver driver;
	
	@FindBy(xpath = "//a[@class='cd-dropdown-trigger desktop-navigation btn btn-primary']")
	private WebElement AllCourses;

	public Coursesmousehover_POM(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver,this);
	}
	public WebElement getAllCourses() {
	return AllCourses;
	}
	@FindBy(xpath = "//span[text()='Cloud Academy']")
	private WebElement Cloud;

	public WebElement getCloud() {
		return Cloud;
	}
	
	@FindBy(xpath = "//span[text()='Devops Academy']")
	private WebElement Devops;
		
	public WebElement getDevops() {
		return Devops;
	}
	
	@FindBy(xpath = "//span[text()='Software Testing Academy']")
	private WebElement STesting;

	public WebElement getSTesting() {
		return STesting;
	}
	
	@FindBy(xpath = "//span[text()='Code Academy']")
	private WebElement Code;
	
	
	public WebElement getCode() {
		return Code;
	}
	
	
	@FindBy(xpath = "//span[text()='Cyber Security Academy']")
	private WebElement Cyber;
	public WebElement getCyber() {
		return Cyber;
	}
	
	@FindBy(xpath = "//span[text()='Career Guidance Academy']")
	private WebElement Career;

	public WebElement getCareer() {
		return Career;
	}
	
	
		

}
