package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_methods {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com/");
		Thread.sleep(1000);
		Actions action = new Actions(driver); 
		WebElement element= driver.findElement(By.linkText("Get started free"));
		
		
		// Using Action class Methos "Move to Element"
		action.moveToElement(element).click();
		
		
		// Code for scrolling the page
		JavascriptExecutor jv=(JavascriptExecutor)driver;
		jv.executeScript("scroll(0,300)");
		
		Thread.sleep(2000);
		
		
		//Using Action class Method "Mouse Hover"
		WebElement live= driver.findElement(By. cssSelector("div.product-cards-wrapper--click a[title='Live']"));
		action.moveToElement(live).build().perform();
		WebElement automate= driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='App Automate']"));  
		automate.click();
		
		
	}
	
	
	
	

}
