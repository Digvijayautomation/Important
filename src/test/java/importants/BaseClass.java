package importants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected static WebDriver driver;
	protected static final String BASE_URL = "https://www.amazon.com";
	protected static final int TIMEOUT = 10;
	
	/**
	 * Initialize WebDriver based on browser parameter
	 * @param browser - Browser type (chrome, firefox, edge)
	 */
	@BeforeTest
	@Parameters({"browser"})
	public void setUp(@Optional("chrome") String browser) {
		initializeBrowser(browser);
		driver.manage().window().maximize();
		driver.get(BASE_URL);
	}
	
	/**
	 * Initialize the browser based on the provided browser type
	 * @param browser - Browser type
	 */
	private void initializeBrowser(String browser) {
		switch(browser.toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
		}
	}
	
	/**
	 * Quit the browser after test execution
	 */
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	/**
	 * Get the current driver instance
	 * @return WebDriver
	 */
	public WebDriver getDriver() {
		return driver;
	}
	
}
