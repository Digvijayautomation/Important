package importants;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printing_element_dropdown {
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
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
		
		// Sorting the arrylist
		ArrayList<String> templist=dropdownlist;
		Collections.sort(templist);
		
		// Printing the sorted array
		System.out.println(templist);
		
		
		// Printing the sorted list
		for(String list:templist)
		{
			System.out.println(list);
		}
		
	}

}
