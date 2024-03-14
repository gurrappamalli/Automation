package SeleniumNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/date-calculator.html");
		Thread.sleep(1000);
		 
		WebElement month= driver.findElement(By.id("today_Month_ID"));
		WebElement day = driver.findElement(By.id("today_Day_ID"));

		  /* 
//Approach 1	
	  Select sel = new Select(day);
	  sel.selectByIndex(10);
		Thread.sleep(1000);
	  Select sel1 = new Select(month);
	  sel1.selectByIndex(11);
		Thread.sleep(1000);
	*/
	 
	//Approach 2	
 	  Select sel = new Select(month);
       List<WebElement> allOptions=sel.getOptions();
 	   WebElement[] allOption;
 	for (WebElement option:allOptions) {
 		if(option.getText().equals("Mar")) {
 			option.click();
 			break;
			
 		
 		}
  }
 	 
	}

}
