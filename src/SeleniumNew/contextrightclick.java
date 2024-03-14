package SeleniumNew;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextrightclick {

	 

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
	 
			System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.flipkart.com");
            WebElement grocery= driver.findElement(By.xpath("//span[text()='Grocery']"));
            Actions act =new Actions(driver);
        	act.contextClick(grocery).perform();
        	Robot r =new Robot();
            r.keyPress(KeyEvent.VK_T); 
            r.keyRelease(KeyEvent.VK_T);
        	//  r.keyPress(keyEvent.VK_T );
		   // r.keyRelease(keyEvent.VK_T );
		    
	 	    
		    Set <String> win = driver.getWindowHandles();
	        Iterator <String> it= win.iterator();
	        String win1= it.next();
	        String win2= it.next();   
	        driver.switchTo().window(win2);
	         
	}

}
