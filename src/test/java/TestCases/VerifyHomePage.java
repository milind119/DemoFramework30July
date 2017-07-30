package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.homepage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import dataProvider.ConfigDataProvider;

public class VerifyHomePage {

	
	  
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		
      driver = BrowserFactory.getBrowser("Firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	
	@Test
	public void testHomePage(){
		
		homepage home = PageFactory.initElements(driver, homepage.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("Avactis Demo Store"));
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		BrowserFactory.closeBrowser(driver);
	}
	

	}
	
	
	
	
	
	
	
	

