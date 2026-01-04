package importants;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElements_List extends BaseClass {

	@BeforeTest
	public void setup() throws InterruptedException {
		driver.navigate().to("https://www.justdial.com/Bangalore/Bakeries");
		Thread.sleep(500);


		
	}


	@Test
	public void Element_List()
	{
		List<WebElement> bakeries = driver.findElements(By.className("store-name"));

		System.out.println(bakeries.size());

		for (WebElement webElement : bakeries) 
		{
			
			System.out.println(webElement.getText());
		}


	}

}


