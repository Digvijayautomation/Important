package importants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Network;
import com.google.common.base.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mobile_browser {
	
	WebDriver driver;
	
	@Test
	  public void userAgentTest(){
		

		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		
	
		DevTools devTools = new DevTools(null, null);
		devTools.createSession();
		// iPhone 11 Pro dimensions
		devTools.send(Emulation.setDeviceMetricsOverride(375,
		                                                 812,
		                                                 50,
		                                                 true, null, null, null, null, null, null, null, null
		                                               ));
		driver.get("https://selenium.dev/");
		driver.quit();
	  }

}
