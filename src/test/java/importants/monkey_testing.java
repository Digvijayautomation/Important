package importants;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class monkey_testing {
	
	// We try click the random footer links in amazon homepage
	
	public static void main(String[] args) throws InterruptedException
	{
		
	WebDriver driver;	
	WebDriverManager.chromedriver().setup();
	
		 driver=new ChromeDriver();
	     driver.navigate().to("https://www.amazon.in/");
		 driver.manage().window().maximize();
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,4300)", "");
	Thread.sleep(2000);
		
		// Will store all the webelement in 
	List<WebElement> footerList=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
		
		int footer_count=footerList.size();
	
		System.out.println("Total Links in Footer are "+footer_count);
	
		Random rand=new Random();
	

	for (int i=0; i<footer_count;i++)
	{
	 // create random number between 1 to footer_count
		int random_index=rand.nextInt(footer_count);
				
		
	  WebElement e=footerList.get(random_index);
	  
	  System.out.println(random_index + "-" +e.getText());
	  
	  // click on random link
	 
	  e.click();  
	 
	  // go back to home page
	  driver.navigate().back();
	 
	  Thread.sleep(1500);
	  
	  // loading elements one again becuase after coming back from clicked link it may not find further elements
	  footerList=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
	//  driver.navigate().refresh();
	  
	}
}
}