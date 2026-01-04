package importants;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class Change_browser_dimensions extends BaseClass {

	@Test
	public void Browser() throws InterruptedException {
		
		driver.manage().window().setSize( new Dimension(100, 500) );
		driver.get("http://demo.guru99.com/test/guru99home/");

		
	}

}
