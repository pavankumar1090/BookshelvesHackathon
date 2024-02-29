package com.StepDefinations;
 
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Factory.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {
	 public static WebDriver driver;
	 static Properties p;
	@BeforeAll
    public static void setup() throws IOException, InterruptedException
    {
    	driver=Baseclass.getWebDriver();
    	p=Baseclass.getProperties();
    	driver.get(p.getProperty("appURL"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.manage().window().maximize();
    	
 
	}
	@AfterStep
    public void addScreenshot(Scenario scenario) {
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
	}
   @AfterAll
  public static void teardown() {
	driver.quit();
}
}

