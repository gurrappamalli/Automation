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
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class merged {

	
		public static <TakeScreenshot> void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://www.flipkart.com");
				
				WebElement searchbox =driver.findElement(By.xpath("//input[@name='q']"));
				searchbox.sendKeys("shoes for men");
				searchbox.sendKeys(Keys.ENTER);
				
				WebElement search = null;
				Point loc=search.getLocation();
				int x = loc.getX();
				int y = loc.getY();
				JavascriptExecutor js= (JavascriptExecutor) driver;
			 		
				js.executeScript("window.scrollBy(0,2000)");
			        Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='_312yBx SFzpgZ'][1]")).click();
				 Set <String> win = driver.getWindowHandles();
		        Iterator <String> it= win.iterator();
		        String win1= it.next();
		        String win2= it.next();   
		        driver.switchTo().window(win2);
				driver.findElement(By.xpath("//button[@class='_2Kpz61 _2U9uOA _3v1-ww']")).click();
				
				
		   		Thread.sleep(2000);
		   		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		        TakeScreenshot ts = (TakeScreenshot)driver;
				 
	 			File  src = ((RemoteWebDriver) ts).getScreenshotAs(OutputType.FILE);
	 			File dest= new File("C:\\Seleniumwebdriver\\screenshot\\shoes.png");
	 			FileUtils.copyFile(src,dest);
	 	       

	}

}
