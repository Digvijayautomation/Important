package importants;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class monkey_testing {
	
	// We try click the random footer links in amazon homepage
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4300)", "");
		Thread.sleep(2000);
		
		// Will store all the webelement in 
		List<WebElement> footerList=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
		
	int footer_count=footerList.size();
	
	System.out.println("Total Links in Footer are "+footer_count);
	
	

	for (int i=0; i<footer_count;i++)
	{
	  int random_index=(int) Math.floor(Math.random()*footer_count);
	 
	  WebElement e=footerList.get(random_index);
	  
	  System.out.println(random_index + "" +e.getText());
	  e.click();
	  Thread.sleep(1500);
	  driver.navigate().back();
	  
	  Thread.sleep(1500);
	  footerList=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
	  
	}
}
}