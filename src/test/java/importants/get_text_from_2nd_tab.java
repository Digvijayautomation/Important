package importants;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class get_text_from_2nd_tab
{
	static WebDriver driver;
	static String text;

	@BeforeTest
	public static void initDriver()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

	@Test
	public static void GetTextFromWindow() throws InterruptedException
		{
			driver.get("https://google.com");
			Thread.sleep(3000);
			driver.switchTo().newWindow(WindowType.TAB);

			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.switchTo().newWindow(WindowType.TAB);
			
			driver.navigate().to("https://msbte.gudexams.com/login");
			Thread.sleep(3000);
			text = driver.findElement(By.tagName("body")).getText();
			System.out.println(text);
			Thread.sleep(3000);

			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(3000);
			
			System.out.println(driver.getTitle());
			
			driver.close();

		}

	@AfterTest
	public static void tearDown()
		{
			driver.quit();
		}
}

