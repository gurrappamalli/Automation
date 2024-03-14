package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		 JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1300)");
			Thread.sleep(1000);
	 	  String projectpath = System.getProperty("user.dir");
	 	  
		 //String projectpath = System.getProperty("user.dir");
			// driver.findElement(By.id("uploadfile")).sendKeys(projectpath+"C:\\Seleniumwebdriver\\screenshot\\Users\\gurra\\Videos\\Pictures\\g.jpg");
	 	 Thread.sleep(1000);
		 driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\gurra\\Videos\\Pictures\\g.jpg");
	}

}
