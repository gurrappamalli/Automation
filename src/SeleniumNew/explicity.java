package SeleniumNew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicity {

	 
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
		//	 driver.manage().timeouts().implicitlyWait(  Duration.ofSeconds(10));
			 driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			 driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
			
			
			
			WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='display-other-button']")));
	}

}
