package Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class runtimepolymorphism {
    public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the browser");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        if(input.equalsIgnoreCase("Chrom")) {
        	System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
        	driver = new ChromeDriver();
        }
        else if(input.equalsIgnoreCase("Fire")) {
        	 System.setProperty("webdriver.gecko.driver","C:\\Seleniumwebdriver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        	 driver = new ChromeDriver();
        }
        else {
        	System.out.println("Invalid");
        	
        }
        driver.get("http://www.flipkart.com");
	}

}
