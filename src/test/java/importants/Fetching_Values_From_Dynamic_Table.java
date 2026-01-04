package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fetching_Values_From_Dynamic_Table extends BaseClass {
	
	@BeforeTest
	public void setup() {
		driver.navigate().to("http://uitestingplayground.com/dynamictable");
	}
	
	@Test
	public void testFetchingValues() {
		
		WebElement CPU_Value_Of_Chrome=driver.findElement(By.xpath("//div[@role='rowgroup']//div[@role='row']//span[contains(text(),'Chrome')]/..//span[4]"));
		
		
		System.out.println(CPU_Value_Of_Chrome.getText());
		
		// it may differ beause columns and rows interchnaging after refreshing
		
		// for traversing back one node we have to use /..
		
		
	}

}
