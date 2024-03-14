package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
			     // Launch the Chrome Browser
			        WebDriver driver = new ChromeDriver();
			     //Enter the URL
					//driver.get("https://artoftesting.com/samplesiteforselenium");
					driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
					Thread.sleep(1000);
		List <WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(1000);
		int count =check.size();
		for (int z=0;z<count;z++)
		{

		check.get(z);
	 
		}
		for (WebElement we:check) {
			we.click();
		}
				

	}
}
