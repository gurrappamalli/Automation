package Selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practiceforallcd {
	public static <TakeScreenshot> void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://artoftesting.com/samplesiteforselenium");
		 driver.findElement(By.id("fname")).sendKeys("java");
		 driver.findElement(By.id("idOfButton")).click();
		 driver.findElement(By.id("male")).click();
		 JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
	     List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	     Thread.sleep(2000);
	     int count =checkbox.size();
			for (int z=0;z<count;z++)
			{

			checkbox.get(z);
		 
			}
			for (WebElement we:checkbox) {
				we.click();
			}
			 
			  Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)");
			WebElement drop=driver.findElement(By.id("testingDropdown"));
			Select n=new Select(drop);
			n.selectByVisibleText("Manual Testing");
			  Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,300)");
			WebElement eletobedragged=driver.findElement(By.id("myImage"));
			WebElement eletobedropped=driver.findElement(By.id("targetDiv"));
			 
			 
			Thread.sleep(1000);
			Actions act =new Actions(driver);
            act.dragAndDrop(eletobedragged, eletobedropped).perform();
}
}
