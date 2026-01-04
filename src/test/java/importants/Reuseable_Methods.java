package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Reuseable_Methods extends BaseClass {

	// overloaded click methods one which take by as argument and 2nd will take
	// webelemnt as arguement

	// Click method For By
	void click(By by) {
		driver.findElement(by).click();
	}

	// Click method For Webelement
	void click(WebElement element) {
		element.click();
	}

	void sendkeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}

	@Test
	public void testReusableMethods() throws InterruptedException {

		// Create varibale for each locator

		// we can do it using 2 ways 1st by using By and 2nd by Using Webelement

		By Todays_Deals = By.linkText("Today's Deals");
		WebElement Customer_Service = driver.findElement(By.linkText("Customer Service"));

		By SearchBox = By.id("twotabsearchtextbox");
		By SearchButton = By.id("nav-search-submit-button");

		// pass the locator to the click method
		click(Todays_Deals);
		Thread.sleep(2000);
		click(Customer_Service);

		Thread.sleep(1000);

		// pass the locator and value
		sendkeys(SearchBox, "Realme SmartTv");
		click(SearchButton);

	}

}
