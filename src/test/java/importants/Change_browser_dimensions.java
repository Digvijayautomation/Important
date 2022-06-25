package importants;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Change_browser_dimensions {
	
	static WebDriver driver;

	@Test
	public void Browser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().setSize( new Dimension(400, 500) );
		driver.get("http://demo.guru99.com/test/guru99home/");

		
	}

}
