package simpleTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert; 

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {

	@Test
	public void startWebDriver()
{
	// Open Firefox
	 WebDriver driver=new FirefoxDriver();

	// Maximize the window
	driver.manage().window().maximize();

	// Pass the url
	driver.get("http://www.google.com");

	// Take screenshot and store as a file format
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("C:/selenium/error.png"));
	}

	catch (IOException e)
	 {
	  System.out.println(e.getMessage());

	 }
}
