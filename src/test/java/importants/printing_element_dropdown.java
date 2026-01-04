package importants;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class printing_element_dropdown extends BaseClass {
	
	@Test
	public void testPrintingDropdown() throws InterruptedException {
		driver.navigate().to("https://online.gudexams.com/adminLogin");
	
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.id("adminType"));
		
		//String all the element of dropdown
		Select dropdown=new Select(element);
		
		
		// String it into arrylist
		ArrayList<String> dropdownlist= new ArrayList<String>();
		
		
		// Using for each for getting text from arrylist
		for(WebElement e:dropdown.getOptions())
		{
			dropdownlist.add(e.getText());
		}
		
		
		Collections.sort(dropdownlist);
		
		// Printing the sorted array
		System.out.println(dropdownlist);
		
		
		// Printing the sorted list
		for(String list:dropdownlist)
		{
			System.out.println(list);
		}
		
	}

}
