package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingwindow {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	     //Enter the URL
	 		 
	 		driver.get("http://www.flipkart.com");
			
			WebElement searchbox =driver.findElement(By.xpath("//input[@name='q']"));
			searchbox.sendKeys("sunglasses");
			searchbox.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//div[@class='_312yBx SFzpgZ'][1]")).click();
			 Set <String> win = driver.getWindowHandles();
	        Iterator <String> it= win.iterator();
	        String win1= it.next();
	        String win2= it.next();   
	        driver.switchTo().window(win2);
			
			driver.findElement(By.xpath("//button[@class='_2Kpz61 _2U9uOA _3v1-ww']")).click();
	   		driver.quit();
  /*
      
	     driver.get("https://www.naukri.com/");
	        WebElement searchbox =driver.findElement(By.xpath("//input[@class='suggestor-input '][1]"));
	        Thread.sleep(1000);
	        searchbox.sendKeys("TESTING");
	        searchbox.sendKeys(Keys.ENTER);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[text()='Senior Software Engineer - Test Automation']")).click();
	        Thread.sleep(1000);
	        Set <String> win = driver.getWindowHandles();
	        Iterator <String> it= win.iterator();
	        String win1= it.next();
	        String win2= it.next();   
	        driver.switchTo().window(win2);
	        
	       //   driver.quit();
      
	   */     
	        
	        
	        
	}

}
