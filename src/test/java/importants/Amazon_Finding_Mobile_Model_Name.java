package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Finding_Mobile_Model_Name {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
		driver.findElement(By.xpath("//a//div[text()='Mobiles, Computers']")).click();
		
		driver.findElement(By.xpath("//li//a[text()='All Mobile Phones']")).click();
		
		
		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,500)");
		
		

		
		driver.findElement(By.xpath("//*[@id='s-refinements']//div[5]//ul//li[2]//span//")).click();
		
	   // driver.findElement(By.xpath("//div[@data-index='1']")).click();
		
		
		//driver.close();
		
		
		
		
		
		
		
		
	}

	
	static void click(WebDriver driver,By by) {
		
		driver.findElement(by).click();
		
		
	}
}
