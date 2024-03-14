package SeleniumNew;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/en/book-a-free-demo/");
		driver.findElement(By.xpath("//input[@name='FullName']")).sendKeys("HJ");
		driver.findElement(By.xpath("//input[@name='FullName']")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@name='FullName']")).getAttribute("id"));
		System.out.println(driver.findElement(By.xpath("//input[@name='action_submitForm']")).getCssValue("background"));
		System.out.println(driver.findElement(By.xpath("//input[@name='FullName']")).getSize());
		System.out.println(driver.findElement(By.xpath("//input[@name='FullName']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//h4[@class='form-tittle']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@name='FullName']")).getTagName());
		
		System.out.println(driver.findElement(By.xpath("//input[@name='action_submitForm']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@name='action_submitForm']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@name='action_submitForm']")).isSelected());
		
 		
		WebElement demo = driver.findElement(By.xpath("//div[@class='demo-section']"));
	    Rectangle rec = demo.getRect();
	    
	    System.out.println(rec.getDimension());
	    System.out.println(rec.getHeight());
	    System.out.println(rec.getWidth());
	    System.out.println(rec.getPoint());
 
	    
	}

}
