package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class craftsvilla {

	public static <TakeScreenshot> void main(String[] args)throws InterruptedException, IOException{
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	     //Enter the URL
			driver.get("https://www.craftsvilla.com/");
			  //Enter the Location
			driver.findElement(By.xpath("//input[@name='citysearch']")).sendKeys("lhjk");
			driver.findElement(By.xpath("//div[@class='form-control']")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			//scroll down
			//using pixel
	 	js.executeScript("window.scrollBy(0,2000)");
	 	Thread.sleep(1000);
 			 driver.findElement(By.xpath("//img[@src='https://cdn1.plotch.io/assets/images/1702618249_MS5wbmc=.png'][1]")).click();
 			 
 			Thread.sleep(1000);
 driver.findElement(By.xpath("//img[@src='https://cdnaz.plotch.io/image/upload/w_301,h_301/C/V/PLO4MuhQIH1689006683_92d17e87d38b9a6ea648338f11ce8206d0731c22a491221a3c447a2ce458211b.jpg?product_id=1108837422&s=1']")).click();

 			TakeScreenshot ts = (TakeScreenshot)driver;
 			 
 			File  src = ((RemoteWebDriver) ts).getScreenshotAs(OutputType.FILE );
 			File dest= new File("C:\\Seleniumwebdriver\\screenshot\\craftsvilla.png");
 			FileUtils.copyFile(src,dest);
 			driver.close();

	  
	}

}
