package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy (xpath="//img[@alt='Google']") 
	private WebElement logo;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	public boolean isLogoPresent() {
		boolean logoFlag =logo .isDisplayed(); 
		
		return false;
		
	}
}
