package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetching_Values_From_Dynamic_Table {
	
	static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.navigate().to("http://uitestingplayground.com/dynamictable");
		
		WebElement CPU_Value_Of_Chrome=driver.findElement(By.xpath("//div[@role='rowgroup']//div[@role='row']//span[contains(text(),'Chrome')]/..//span[4]"));
		
		
		System.out.println(CPU_Value_Of_Chrome.getText());
		
		// it may differ beause columns and rows interchnaging after refreshing
		
		// for traversing back one node we have to use /..
		
		
		
		
		
		driver.quit();
		
		
	}

}
