package simpleTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert; 

public class firstTest {

	@Test
	public void startWebDriver()
	{
		System.setProperty("webdriver.gecko.driver","gecko/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");		
		//driver.navigate().to("http://www.google.com/");
		Assert.assertTrue("Is title correct", driver.getTitle().startsWith("Google"));
		//driver.getScreenshotAs("screenie.png");
		driver.close();
	}
} 
