package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forallpractice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		 JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1300)");
			Thread.sleep(1000);
	 	  String projectpath = System.getProperty("user.dir");
	 	  
		 //File uploaded
		 driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\gurra\\Videos\\Pictures\\g.jpg");
		 driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("jiosad");
		 driver.findElement(By.xpath("//input[@class='gsc-search-button']")).click();
		 //radio
		 driver.findElement(By.id("radio1")).click();
		 //checkbox
		 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	     Thread.sleep(2000);
	     int count =checkbox.size();
			for (int z=0;z<count;z++)
			{

			checkbox.get(z);
		 
			}
			for (WebElement we:checkbox) {
				we.click();
			}
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.id("prompt")).click();
			Thread.sleep(1000);
	     
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_P); 
		    r.keyRelease(KeyEvent.VK_P);
		    
		    r.keyPress(KeyEvent.VK_S); 
		    r.keyRelease(KeyEvent.VK_S); 
		    r.keyPress(KeyEvent.VK_P); 
		    r.keyRelease(KeyEvent.VK_P);
		    r.keyPress(KeyEvent.VK_K); 
		    r.keyRelease(KeyEvent.VK_K); 
		    //search(key.ENTER)
		    driver.close();
	}

} 
