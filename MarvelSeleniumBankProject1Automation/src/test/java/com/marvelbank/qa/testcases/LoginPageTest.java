package com.marvelbank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.marvelbank.qa.base.TestBase;
import com.marvelbank.qa.pages.HomePage;
import com.marvelbank.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage=new LoginPage();
		
	}
	@Test(priority=0)
	public void validateTitle() {
		Assert.assertEquals(loginPage.validateLoginPageTitle(), "Guru99 Bank Home Page");
		
	}
	
	@Test(priority=1)
	public void valiateLogo() {
		Assert.assertTrue(loginPage.validateLoginPageLogo());
		
	}
	@Test(priority=2)
	public void loginToApp() {
             homepage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
		
	}
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
 