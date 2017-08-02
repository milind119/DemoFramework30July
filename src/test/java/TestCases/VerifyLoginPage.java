package TestCases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.LoginPage;
import ApplicationPages.homepage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import dataProvider.ConfigDataProvider;

public class VerifyLoginPage {

	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver = BrowserFactory.getBrowser("FireFox");
		DataProviderFactory.getConfig();
		driver.get(ConfigDataProvider.getApplicationUrl());
				
	}
	
	@Test
	public void verifylogin()
	{
		
		homepage home = PageFactory.initElements(driver, homepage.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("Avactis Demo Store"));
		
		home.clickonLoginlink();
				
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		
		login.loginApplication(DataProviderFactory.getExccel().getData(0, 0, 0), DataProviderFactory.getExccel().getData(0, 0, 1));

		
	}
	
	
	
	
	
	
	
	
	
	
	
}
