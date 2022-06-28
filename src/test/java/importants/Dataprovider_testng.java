package importants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider_testng {
		
static WebDriver driver;
	

	@BeforeMethod
	public static void test() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
    }
	
	
	
	@Test(dataProvider ="data_for_login_test")
	public static void login(String Username, String Password) throws InterruptedException {
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		Thread.sleep(1000);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Thread.sleep(1000);
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		driver.quit();
		
		
	}
	
	@DataProvider(name="data_for_login_test")
	public  Object[][] LogintestData() {
		Object[][] logindata=new Object[2][2];
		
		logindata[0][0]="Admin";
		logindata[0][1]="admin123";
		
		logindata[1][0]="adminxyc";
		logindata[1][1]="hshdjs";
		
		return logindata;
	}

}