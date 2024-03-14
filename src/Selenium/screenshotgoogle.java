package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshotgoogle {

	public static <TakeScreenshot> void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	     //Enter the URL
			driver.get("https://www.google.co.in/");
			
			TakeScreenshot ts = (TakeScreenshot)driver;
			 
			File  src = ((RemoteWebDriver) ts).getScreenshotAs(OutputType.FILE );
			File dest= new File("C:\\Seleniumwebdriver\\screenshot\\sgoogle.png");
			FileUtils.copyFile(src,dest);
			driver.close();

	}

}
