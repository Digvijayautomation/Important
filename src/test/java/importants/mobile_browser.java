package importants;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.testng.annotations.Test;

public class mobile_browser extends BaseClass {
	
	@Test
	public void userAgentTest(){
		
	
		try (DevTools devTools = ((org.openqa.selenium.chrome.ChromeDriver)driver).getDevTools()) {
			devTools.createSession();
			// iPhone 11 Pro dimensions
			devTools.send(Emulation.setDeviceMetricsOverride(375,
			                                                 812,
			                                                 50,
			                                                 true, null, null, null, null, null, null, null, null
			                                               ));
		}
		driver.get("https://selenium.dev/");
		driver.quit();
	  }

}
