package com.marvelbank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	 public static Properties prop;
	public static  WebDriver driver;
	public TestBase() {

	prop=new Properties();
	
	try {
		FileInputStream ip=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\MarvelSeleniumBankProject1Automation\\src\\main\\java\\com\\marvelbank\\qa\\"
				+ "config\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
	  e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	 
	}
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			
			System.setProperty("Webdriver.chrome.driver", "c:\\selenium driver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}else {
			System.out.println("None of the browser identified");		
			}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
}
	
	
