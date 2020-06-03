package com.crm.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("D://Subit'sMaven//June_Workspace//freeCRMTest//src//main//java//com//crm//config//config.properties"));
			prop.load(fis);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void setUp()
	{
		
	
			System.setProperty("webdriver.chrome.driver", "C://Users//Chiku//Desktop//selenium//drivers//chrome//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://classic.crmpro.com/");
			
	}
	

	
	
}
