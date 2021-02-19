package com.qa.bayernm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.bayernm.base.BasePage;

public class HomePage extends BasePage {
	
	private WebDriver driver;
	//By locators - OR
	By cookie = By.id("uc-btn-accept-banner");
	By login = By.xpath("//span[contains(text (), 'Log in')]");
	By fanstore = By.xpath("//div[text() ='Fan Store']");
	By shoplink = By.xpath("//a[@title='Shop'][@class='button small']");
	By newsletter = By.xpath("//h3[normalize-space()='Sign up for the FC Bayern Newsletter']");
	
	
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Page Actions
	public void acceptCookie() {
		driver.findElement(cookie).click();
	}
	
	public String getLoginPageTitle() {
		driver.findElement(cookie).click();
		return driver.getTitle();
	}
	
	public boolean isLoginLinkExist() {
		return driver.findElement(login).isDisplayed();
	}
	
	public String isFanStoreExist() {
		String text = driver.findElement(fanstore).getText();
		if(text.equals("FAN STORE")) {
			System.out.println("Fan Store is displayed");
		}
		else {
			System.out.println("Fan store is missing");
		}
		return text;
	
	}
	public boolean isShopLinkDisplayed() {
		return driver.findElement(shoplink).isDisplayed();
	}
	

}
