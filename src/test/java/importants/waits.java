package importants;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits {


	static WebDriver driver;


	@BeforeMethod
	public static void test() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}



	@SuppressWarnings("deprecation")
	@Test(priority=0)
	public static void Implicit_Wait()  // Implicit wait applied for all the elements/events automatically after declaring
	{

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);// it every event is not completed within 3 seconds it will through error
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Assert.assertTrue(driver.findElement(By.id("btnSearchValues")).isDisplayed());

		driver.quit();
	}

	@Test(priority=1)
	public static void Explicit_Wait()
	{	
		driver.get("https://www.rentomojo.com/");
		driver.findElement(By.linkText("Pune")).click();

		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 2); // IT WILL WAIT FOR 2 SECOND TO CHECK "Packages" element is is visible or not
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Packages"))));
		driver.findElement(By.linkText("Packages")).click();

	}
	@Test(priority=2)
	public static void Fluetwait() 
	{
		driver.get("https://msbte.org.in/");
		
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))  // Totalally it will wait for 30 seconds
				.pollingEvery(Duration.ofSeconds(10)) // After every 10 second it will check the link is enabled or not
				.ignoring(Exception.class);
		
		WebElement element = (WebElement) wait.until(new Function<WebDriver, WebElement>() 
		{
            @Override
            public WebElement apply(WebDriver arg0) {
            	
            	//Checking for hyperlink which is with marque tag
                WebElement linkelement = driver.findElement(By.linkText("Suggestive Question bank Summer 2022."));
                if (linkelement.isEnabled()) {
                    System.out.println("Element is Found");
                }
                return linkelement;
            }
        });
        element.click();

		


		
		

	}



}
