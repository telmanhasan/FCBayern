package com.qa.bayernm.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.bayernm.base.BasePage;
import com.qa.bayernm.pages.HomePage;

public class HomePageTest {
	
	WebDriver driver;
	BasePage basePage;
	Properties prop; 
	HomePage homePage;
	
	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.init_driver(prop);
		homePage = new HomePage(driver);
		
	}
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		String title = homePage.getLoginPageTitle();
		System.out.println("login page title is : " + title);
		Assert.assertEquals(title, "Home - FC Bayern Munich");
	}
	
	@Test(priority=2)
	public void isLoginLinkExist() {
		Assert.assertTrue(homePage.isLoginLinkExist());
		
	}
	
	@Test(priority =3)
	public void isFanStoreExist() {
		String text = homePage.isFanStoreExist();
		System.out.println(text);
	}
	
	@Test(priority = 4)
	public void isShopLinkDisplayed() {
		Assert.assertTrue(homePage.isShopLinkDisplayed());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
