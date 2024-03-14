package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getprompt {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		 JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.id("prompt")).click();
			Thread.sleep(1000);
	     //	Alert a	=driver.switchTo().alert();
			//System.out.println(a.getText());
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_P); 
		    r.keyRelease(KeyEvent.VK_P);
		    
		    r.keyPress(KeyEvent.VK_S); 
		    r.keyRelease(KeyEvent.VK_S); 
		    r.keyPress(KeyEvent.VK_P); 
		    r.keyRelease(KeyEvent.VK_P);
		    r.keyPress(KeyEvent.VK_K); 
		    r.keyRelease(KeyEvent.VK_K); 
		    
		    //r.sendKeys(Keys.ENTER);
		 
	}

}
