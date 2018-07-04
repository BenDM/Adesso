package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	private static WebDriver driver;

	@Before
	public void setUp()
	{
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id<locator>));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id<locator>));

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\divers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:9091/insuria-commission-web-war");
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

	public static WebDriver getDriver()
	{
		return driver;
	}
}
