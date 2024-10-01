package pomitlearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscribe_POM {
	public WebDriver driver;
	
	
	@FindBy(xpath = "//input[@placeholder='Provide your email']")
	private WebElement Email;
	
	
	
	
	public Subscribe_POM(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getEmail() {
		return Email;
	}


	@FindBy(xpath = "//span[@class='elementor-button-text']")
	private WebElement SubCrib;


	public WebElement getSubCrib() {
		return SubCrib;
	}

}
