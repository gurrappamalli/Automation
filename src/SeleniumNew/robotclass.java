package SeleniumNew;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tinyurl.com/bdhazprv");
		Thread.sleep(1000);
		WebElement newlaunche= driver.findElement(By.xpath("//img[@alt='New Launches from Mobile, Electronics & more']"));
       Actions act =new Actions(driver);
    	act.contextClick(newlaunche).perform();
    	Robot r =new Robot();
        r.keyPress(KeyEvent.VK_T); 
        r.keyRelease(KeyEvent.VK_T);
    	 
	     Set <String> win = driver.getWindowHandles();
        Iterator <String> it= win.iterator();
        String win1= it.next();
        String win2= it.next();   
        driver.switchTo().window(win2);
        
	}

}
 