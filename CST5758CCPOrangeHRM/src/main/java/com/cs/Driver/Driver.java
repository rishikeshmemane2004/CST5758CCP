package com.cs.Driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cs.DriverFactory.DriverFactory;
import com.cs.DriverManager.DriverManager;

import static com.cs.ReadPropertyFile.ReadPropertyFile.prop;

public class Driver {

	static WebDriver driver;

	static public WebDriver initDriver() 
	{
		String br = prop.getProperty("browser");
		
		if (DriverManager.getDriver() == null)
		{
			driver = DriverFactory.getDriver(br);
			DriverManager.setDriver(driver);
		}
		
		DriverManager.getDriver().get(prop.getProperty("url"));
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("timeOut"))));
		
		boolean maxWindow = Boolean.parseBoolean(prop.getProperty("windowMax"));
		System.out.println("maxWindow : "  + maxWindow);
		if (maxWindow)
			DriverManager.getDriver().manage().window().maximize();
		
		
		return DriverManager.getDriver();
	}
	
	static public void quitBrowser()
	{
		if (DriverManager.getDriver() != null)
		{
			DriverManager.getDriver().quit();
			DriverManager.setDriver(null);
		}
	}
}
