package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	     //Enter the URL
			driver.get("https://www.bookmyshow.com/");
			driver.findElement(By.xpath("//span[text()='Chennai']")).click();
            driver.findElement(By.xpath("//div[@class='bwc__sc-1nbn7v6-14 khhVFa']")).click();
            driver.findElement(By.xpath("//input[@id ='mobileNo']")).sendKeys("7732099631");
            driver.findElement(By.xpath("//button[@class='bwc__sc-dh558f-37 hmbiuL']")).click();
	}

}
