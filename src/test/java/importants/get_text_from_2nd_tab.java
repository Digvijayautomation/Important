package importants;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

// open three tabs and get title of 2nd tab
public class get_text_from_2nd_tab extends BaseClass {
	String text;

	@Test
	public void GetTextFromWindow() throws InterruptedException
		{
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

