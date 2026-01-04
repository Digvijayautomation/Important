package importants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class List extends BaseClass {

	@BeforeTest
	public void setup() throws InterruptedException {
		driver.navigate().to("https://sgu.gudexams.com/");
		Thread.sleep(1000);
	}


	@Test
	public void login() throws InterruptedException {



		WebElement elements = (WebElement) driver.findElements(By.tagName("input"));

		System.out.println(elements.getSize());


	




	}






}
