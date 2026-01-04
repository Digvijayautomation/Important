package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframes extends BaseClass {
	
	@BeforeTest
	public void setup() {
		driver.manage().window().setSize( new Dimension(700, 900) );
		driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		
	}
	
	@Test
	public void checking_frames()
	{
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		
	}

}
