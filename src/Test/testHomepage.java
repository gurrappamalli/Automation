package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;

public class testHomepage {
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
		 driver.get("https://www.google.co.in/");
	}
	@Test
	void LogoTest() {
		HomePage hpo  = new HomePage(driver);
		boolean actuallogo = hpo.isLogoPresent();
		Assert.assertTrue(actuallogo, "Logo is successful visible");
		
	}

}
