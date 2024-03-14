package SeleniumNew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	     // Launch the Chrome Browser
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	     //Enter the URL
			driver.get("https://demoqa.com/droppable/");
			Thread.sleep(3000);
		    WebElement scroll= driver.findElement(By.xpath("//div[@id='simpleDropContainer']"));
		/*	
			  
			Point loc = search.getLocation();
			int x = loc.getX();
			int y = loc.getY();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 
			js.executeScript("scrollBy("+x+","+y+")");
			*/
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
				
		 	js.executeScript("window.scrollBy(0,2000)");
			
			WebElement elementtobedragged= driver.findElement(By.id("draggable"));
			WebElement elementtobedropped= driver.findElement(By.id("droppable"));
			Actions act =new Actions(driver);
			act.dragAndDrop(elementtobedragged, elementtobedropped).perform();
	}

}
