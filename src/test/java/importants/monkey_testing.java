package importants;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class monkey_testing extends BaseClass {
	
	// We try click the random footer links in amazon homepage
	
	@Test
	public void testMonkeyTesting() throws InterruptedException {
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,4300)", "");
	Thread.sleep(2000);
		
		// Will store all the webelement in 
		List<WebElement> footerList=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
		System.out.println("Total Links in Footer are "+footer_count);
	
		Random rand=new Random();
	

	for (int i=0; i<footer_count;i++)
	{
	 // create random number between 1 to footer_count
		int random_index=rand.nextInt(footer_count);
				
		
	  WebElement e=footerList.get(random_index);
	  
	  System.out.println(random_index + "-" +e.getText());
	  
	  // click on random link
	 
	  e.click();  
	 
	  // go back to home page
	  driver.navigate().back();
	 
	  Thread.sleep(1500);
	  
	  // loading elements one again becuase after coming back from clicked link it may not find further elements
	  footerList=driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
	//  driver.navigate().refresh();
	  
	}
}
}