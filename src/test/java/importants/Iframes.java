package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	
	static WebDriver driver;
	
	@BeforeTest
	public static void test1() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize( new Dimension(700, 900) );
		driver.get("http://demo.guru99.com/test/guru99home/");
		
	}
	
	@Test
	public static void checking_frames()
	{
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		
	}

}
