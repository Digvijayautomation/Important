package importants;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Hashmap {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.get("https://maharashtranursingcouncil.co.in/mnc/mnc_w17/outer.php?q=6");
		Thread.sleep(500);	
		
		
		
		//Hashmap 
		System.out.println(hashmapping());
		String uname_passs= hashmapping().get("admin");
		
		driver.findElement(By.id("username")).sendKeys(uname_passs.split(":")[0]);
		driver.findElement(By.id("password")).sendKeys(uname_passs.split(":")[1]);
			
	
	}


	public static HashMap<String,String> hashmapping() {

		HashMap<String,String> map=new HashMap<String, String>();

		map.put("student", "digvijay:12345");
		map.put("admin", "reg_admin:bms789!@#");
		map.put("inst", "0735: inst@123");

		return map;	
	}
	
	
}
