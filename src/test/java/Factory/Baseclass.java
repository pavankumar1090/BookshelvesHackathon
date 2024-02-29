package Factory;
 
import java.io.File;

import java.io.FileInputStream;

import java.io.FileReader;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import java.util.Properties;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


 
public class Baseclass {

	static Properties p;

	public static WebDriver driver;

	public static WebDriver getWebDriver() throws IOException {	

		//C:\\Users\\2304126\\eclipse-workspace\\CAS\\src\\test\\resources\\config.properties
		if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			//os
			if (getProperties().getProperty("os").equalsIgnoreCase("windows")) {
			    capabilities.setPlatform(Platform.WIN11);
			} else if (getProperties().getProperty("os").equalsIgnoreCase("mac")) {
			    capabilities.setPlatform(Platform.MAC);
			} else {
			    System.out.println("No matching OS..");
			      }
			//browser
			switch (getProperties().getProperty("browser").toLowerCase()) {
			    case "chrome":
			        capabilities.setBrowserName("chrome");
			        break;
			    case "edge":
			        capabilities.setBrowserName("MicrosoftEdge");
			        break;
			    default:
			        System.out.println("No matching browser");
			     }
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		}
		else if(getProperties().getProperty("execution_env").equalsIgnoreCase("local"))
			{
				switch(getProperties().getProperty("browser").toLowerCase()) 
				{
				case "chrome":
			        driver=new ChromeDriver();
			        break;
			    case "edge":
			    	driver=new EdgeDriver();
			        break;
			    default:
			        System.out.println("No matching browser");
			        driver=null;
				}
			}
		 driver.manage().deleteAllCookies(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		 return driver;

//		Properties obj = new Properties();
//
//		File file= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
//
//		FileInputStream f = new FileInputStream(file);
//
//		obj.load(f);		
//
//		String browserName=obj.getProperty("browser");		
//
//		//WebDriver driver=null;		
//
//		if(browserName.equalsIgnoreCase("chrome")) {
//
//			driver=new ChromeDriver();
//
//		}
//
//		else if(browserName.equalsIgnoreCase("edge")) {
//
//				 driver=new EdgeDriver();
//
//		}
//
//		else {
//
//			System.out.println("Enter a Valid Browser");
//
//		}	
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
//
//		return driver;

	}

	public static WebDriver getDriver() {

		return driver;

	}

	public static Properties getProperties() throws IOException

	{		 

	   FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");

	   p=new Properties();

		p.load(file);

		return p;

	}
 
}
