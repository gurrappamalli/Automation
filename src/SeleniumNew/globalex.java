package SeleniumNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class globalex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	     //Enter the URL
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
			Thread.sleep(3000);
	}

}
