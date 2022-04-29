package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
// ** We can call by the name of the class 
// by creating an object
	@Test
	public void ValidUserShouldBeAbleToLoginTest() {
		driver = BrowserFactory.init();
		
		LoginPage loginPage1 = new LoginPage();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
	}

}
