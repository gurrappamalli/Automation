package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class allmergedscroll {

	public static <TakeScreenshot> void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
	        WebElement searchbox =driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	        Thread.sleep(1000);
	        searchbox.sendKeys("Pavan Kalyan");
	        searchbox.sendKeys(Keys.ENTER);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			//scroll down
			//using pixel
	 	   js.executeScript("window.scrollBy(0,2000)");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@class='oyj2db OSrXXb'][1]")).click();
	        Thread.sleep(1000);
	        Set <String> win = driver.getWindowHandles();
	        Iterator <String> it= win.iterator();
	        String win1= it.next();
	        String win2= it.next();   
	        driver.switchTo().window(win2);
	        
	        Thread.sleep(1000);  
	       
	        
	        TakeScreenshot ts = (TakeScreenshot)driver;
			 
 			File  src = ((RemoteWebDriver) ts).getScreenshotAs(OutputType.FILE);
 			File dest= new File("C:\\Seleniumwebdriver\\screenshot\\PSPKMOVIES.png");
 			FileUtils.copyFile(src,dest);
 			
 			driver.close();


	}

}
