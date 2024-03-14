package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hnadlingscrollbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	     //Enter the URL
			driver.get("https://www.youtube.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//scroll down
			//using pixel
			js.executeScript("window.scrollBy(0,2000)");
			
		//scroll up	
			js.executeScript("window.scrollBy(0,-700)");

	}

}
