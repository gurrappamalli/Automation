package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsforall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
			     // Launch the Chrome Browser
			        WebDriver driver = new ChromeDriver();
			        Navigation nav=driver.navigate();            
					  nav.to("http://www.facebook.com");
					  nav.forward();
				 	  nav.back();
				      nav.refresh();
				 	 // driver.quit();
		 		//driver.close();
		
	 	
				 			
				
	  	 
			     // Launch the Chrome Browser
			    //WebDriver driver = new ChromeDriver();
			     //Enter the URL
			 		 
			 	driver.get("http://www.flipkart.com"); 
				WebElement searchbox =driver.findElement(By.xpath("//input[@name='q']"));
				searchbox.sendKeys("sunglasses");
				searchbox.sendKeys(Keys.ENTER);
		        Set <String> win = driver.getWindowHandles();
		        Iterator <String> it= win.iterator();
		        String win1= it.next();	
		        String win2= it.next();   
		        driver.switchTo().window(win2);
				
				 
	}

}
