package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dynamic_table_handling extends BaseClass {

	@Test
	public void Dymaic_table() throws InterruptedException {
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// First have to find and store number of rows in list
	   java.util.List<WebElement> ele=	driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		 
	   System.out.println(ele.size() +"-Number of Rows");
		 
		 
		 
		 for(int rows=0;rows<ele.size();rows++)
		 {
			 // using rows we can noe find the columns 
			  java.util.List<WebElement> columns= ele.get(rows).findElements(By.tagName("td"));
			 
			 for(int num=0;num<columns.size();num++)
			 {
			 System.out.println(columns.get(num).getText());
			 }
			 
			
		 }
		 
		 
		
		 
		 
		 
		 
		 
		

		
	}

}
