package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_drop {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		Actions action=new Actions(driver); // 1st we have to create object of Actions class and pass driver as parameter
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']"))); // for switcing from main page to frmae
		
		
		WebElement Drag_source= driver.findElement(By.id("draggable")); // element which is to be drag
		
		WebElement Drop_target= driver.findElement(By.id("droppable")); // element where to to drag
		
	
		
		Thread.sleep(1000);
		
		
		 
		
		action.clickAndHold(Drag_source).moveToElement(Drop_target).release().build().perform(); // click and hold the element which is to be drag and move and release that where it is to be droped
		
		
		// we can do it alos using below method
		
	//	action.dragAndDrop(Darg_source, Drop_target).build().perform();
		
		
		
		
		
		
		// For switching back to main window from frmae window
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		// we can also replace javascriptexecutor for scrolling using action class
		
		
		WebElement element_to_be_clicked_after_scrolling=driver.findElement(By.xpath("//a[@class='icon-group']"));
		
		
		action.moveToElement(element_to_be_clicked_after_scrolling).click().build().perform(); // it will first scroll to that element and then it will click
		
		
		
		
		
		
	}

}
