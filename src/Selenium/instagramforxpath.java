package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramforxpath {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	     //Enter the URL
			driver.get("https://www.instagram.com/");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Gurua");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gfsg867fg");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
			//driver.findElement(By.xpath("div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7732099631");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("096281");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_a9-- _ap36 _a9_0']")).click();
			
			
	}

}
