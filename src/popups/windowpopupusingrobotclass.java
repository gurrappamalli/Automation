package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopupusingrobotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.grammarly.com/plagiarism-checker");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@style='margin-right:0.75rem']")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		
		StringSelection str = new StringSelection("C:\\Users\\gurra\\Downloads\\Accenture Resume 1.docx");
		Thread.sleep(1000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
		
		r.keyPress(KeyEvent.VK_CONTROL); 
	      r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_CONTROL); 
	      r.keyRelease(KeyEvent.VK_V);
	      
	      r.keyPress(KeyEvent.VK_ENTER); 
	      r.keyRelease(KeyEvent.VK_ENTER);
	        
		

	}

}
