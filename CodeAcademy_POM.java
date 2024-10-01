package pomitlearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

		public class CodeAcademy_POM {
		static WebDriver driver;
			
		@FindBy(xpath = "//a[@class='cd-dropdown-trigger desktop-navigation btn btn-primary']")
		private WebElement AllCourses;
		
				public CodeAcademy_POM(WebDriver driver2) {
			driver=driver2;
			PageFactory.initElements(driver,this);
			}

		public WebElement getAllCourses() {
			return AllCourses;
		}
		//code academy
		
			@FindBy(xpath = "//span[text()='Code Academy']")
			private WebElement code;

			public WebElement getCode() {
				return code;
			}
			
			@FindBy(xpath = "//span[text()='Java for Beginners']")
			private WebElement Java;

			public WebElement getJava() {
				return Java;
			}
			
			@FindBy(xpath = "/html/body/div[1]/div/main/div/article/div[2]/div[1]/div/div[3]/div[1]/div[1]/ul/li[6]/a/button")
			private WebElement FreeTrial;

			public WebElement getFreeTrial() {
				return FreeTrial;
			}
			
			@FindBy(xpath ="/html/body/div[1]/div/main/div/article/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[9]/div/div[1]/div/div/div[1]/div/div[2]/div/form/div/button")
			private WebElement MonthlyTrial;

			public WebElement getMonthlyTrial() {
				return MonthlyTrial;
			}
			
			@FindBy(id = "user_login")
			private WebElement user;

			public WebElement getUser() {
				return user;
			}
			
			@FindBy(id = "user_pass")
			private WebElement pass;

			public WebElement getPass() {
				return pass;
			}
			@FindBy(name = "wp-submit")
			private WebElement Login;

			public WebElement getLogin() {
				return Login;
			}
			@FindBy(xpath = "//span[text()='Logout']")
			private WebElement Logout;

			public WebElement getLogout() {
				return Logout;
			}
			}
		
