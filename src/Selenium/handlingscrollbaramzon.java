package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingscrollbaramzon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	     //Enter the URL
			driver.get("http://tinyurl.com/mrxzkvw4");
			 driver.findElement(By.xpath("//a[text()='Shop fashion']")).click();
	   WebElement search=driver.findElement(By.xpath("//img[@class='DealImage-module__imageObjectFit_1G4pEkUEzo9WEnA3Wl0XFv']"));
			 
		Point loc=search.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//scroll down		
		js.executeScript("scrollBy("+x+","+y+")");
		
	}

}
