package importants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List {

	public WebDriver driver;




	@BeforeTest
	public void Browser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://sgu.gudexams.com/");
		Thread.sleep(1000);
	}


	@Test
	public void login() throws InterruptedException {



		WebElement elements = (WebElement) driver.findElements(By.tagName("input"));

		System.out.println(elements.getSize());


	




	}






}
