package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.automateloginPage;

public class testautomate {
	WebDriver driver;
	@BeforeTest
	void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
	}
	
	@BeforeClass
	void launchURL() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://practicetestautomation.com/practice-test-login/");
		 
		 
	}
	@Test
	void loginTest() {
		automateloginPage sg= new automateloginPage(driver);
		sg.setcredentials("student","Password123");
		sg.login();
	}
}
