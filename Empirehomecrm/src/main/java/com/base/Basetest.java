package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.utils.Eventlistener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

	public static Properties prop;
	FileInputStream file;
	public static WebDriver driver;
	//protected ExtentReports extentreports;
	public static EventFiringWebDriver e_driver;
	public static Eventlistener listenerss;
	

	public Basetest() {

		try {
			file = new FileInputStream("./src/main/java/com/configprop/credentialsprop");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		prop = new Properties();

		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//		extentreports = new ExtentReports();
//		ExtentSparkReporter spark= new ExtentSparkReporter(".\\target\\report.html");
//	    extentreports.attachReporter(spark);
//	    
	  

	}

	public void initialization() {
		WebDriverManager.chromedriver().setup();

		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equals("firefox")) {

			driver = new FirefoxDriver();
		}
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		listenerss = new Eventlistener();
		e_driver.register(listenerss);
		driver = e_driver;

		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		//extentreports.flush();

	}

}
