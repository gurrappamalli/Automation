package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meshoapplication {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	     //Enter the URL
			driver.get("https://www.meesho.com/auth?redirect=https%3A%2F%2Fwww.meesho.com%2F&source=profile&entry=header&screen=HP");
			//driver.findElement(By.xpath("//span[text()='Chennai']")).click();
            //driver.findElement(By.xpath("//div[@class='bwc__sc-1nbn7v6-14 khhVFa']")).click();
            driver.findElement(By.xpath("//input[@type ='tel']")).sendKeys("7732099631");
            Thread.sleep(1000); 
            driver.findElement(By.xpath("//span[@class='sc-dkrFOg bWqmzz']")).click();
	}

}
