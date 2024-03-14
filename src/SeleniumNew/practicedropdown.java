package SeleniumNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practicedropdown {
//aprroach3
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/date-calculator.html");
		Thread.sleep(1000);
		 
		WebElement month= driver.findElement(By.id("today_Month_ID"));
		practicedropdown(month,"Mar");
		WebElement day = driver.findElement(By.id("today_Day_ID"));
		practicedropdown(day,"10");
		WebElement month1 = driver.findElement(By.id("ageat_Month_ID"));
		practicedropdown(month1,"Sep"); 
		WebElement day1 = driver.findElement(By.id("ageat_Day_ID"));
		practicedropdown(day1,"10");
		WebElement month2 = driver.findElement(By.id("today2_Month_ID"));
		practicedropdown(month2,"Sep"); 
		WebElement day2 = driver.findElement(By.id("today2_Day_ID"));
		practicedropdown(day2,"10");
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
	}
  //         driver.findElement(By.xpath("//select[@name='c2op']") ).click();
private static void practicedropdown(WebElement ele, String value) {
	// TODO Auto-generated method stub
	 Select drp = new Select(ele);
 	  List<WebElement> allOptions=drp.getOptions();
 	  
 	for (WebElement option:allOptions) {
 		if(option.getText().equals(value)) {
 			option.click();
 			break;
	
}

 	}
 	
}
}
