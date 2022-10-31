package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reuseable_Methods {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		// Create varibale for each locator 
		
		By Todays_Deals=By.linkText("Today's Deals");
		By Customer_Service=By.linkText("Customer Service");
		
		By SearchBox=By.id("twotabsearchtextbox");
		By SearchButton=By.id("nav-search-submit-button");
		
		
		// pass the locator to the click method
		click(Todays_Deals);
		Thread.sleep(1000);
		click(Customer_Service);
		
		Thread.sleep(1000);

		//pass the locator and value
		sendkeys(SearchBox, "Realme SmartTv");
		click(SearchButton);
		
		
	}
	
	// Click method
	static void click(By by)
	{
		driver.findElement(by).click();
	}
	
	static void sendkeys(By by, String value)
	{
		driver.findElement(by).sendKeys(value);
	}

}
