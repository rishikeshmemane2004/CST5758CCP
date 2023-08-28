package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.DriverManager.DriverManager;
import com.cs.enums.WaitType;

import SeleniumUtils.Utils;

public class LoginPage {

	//Locators
	private static final By TXT_USERNAME = By.name("username");
	private static final By TXT_PASSWORD = By.name("password");
	private static final By BTN_LOGIN = By.xpath("//button[@type='submit']");
	
	//methods
	private LoginPage enterUsername(String un)
	{
		Utils.type(TXT_USERNAME, un, WaitType.PRESENCE,"USERNAME"); 
		return this;
	}
	private LoginPage enterPassword(String pwd)
	{
		Utils.type(TXT_PASSWORD, pwd, WaitType.PRESENCE,"PASSWORD");
		return this;
	}
	
	private HomePage clickLogin()
	{
		Utils.clickElement(BTN_LOGIN, WaitType.CLICKABLE,"LOGIN BUTTON");
		return new HomePage();
	}
	
	public HomePage enterLoginDetails(String un, String pwd)
	{
		return enterUsername(un)
				.enterPassword(pwd)
				.clickLogin();
	}
}
