package importants;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_List {


	static WebDriver driver;

	@BeforeTest
	public void Browser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/Bangalore/Bakeries");
		Thread.sleep(500);


		
	}


	@Test
	public void Element_List()
	{
		List<WebElement> bakeries = driver.findElements(By.className("store-name"));

		System.out.println(bakeries.size());

		for (WebElement webElement : bakeries) 
		{
			String name = webElement.getText();
			System.out.println(name);
		}


	}

}


