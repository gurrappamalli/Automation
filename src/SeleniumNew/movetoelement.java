package SeleniumNew;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
		 
				System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.flipkart.com");
				WebElement fashion= driver.findElement(By.xpath("//span[text()='Fashion']"));
				Actions act =new Actions(driver);
		        act.moveToElement(fashion).perform();
		        driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
		   //    driver.close();
	}

}
