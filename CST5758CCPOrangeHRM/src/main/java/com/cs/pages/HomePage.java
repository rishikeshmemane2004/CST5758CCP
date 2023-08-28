package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.DriverManager.DriverManager;
import com.cs.enums.WaitType;

import SeleniumUtils.Utils;

public class HomePage {

	//Locators
	private static final By HDR_DASHBOARD =  By.xpath("//h6[text()='Dashboard']");
	private static final By PIM_MENU =  By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");	 
	private static final By BTN_ADD =  By.xpath("(//button[@type='button'])[4]");	 
	
	
	public void clickOnPIM()
	{
		Utils.clickElement(PIM_MENU, WaitType.PRESENCE, "PIM MENU");
	}
	
	public CustomerPage clickOnADDBTN()
	{
		Utils.clickElement(BTN_ADD, WaitType.CLICKABLE, "ADD BUTTON");
		return new CustomerPage();
	}
	
	//methods
	public String getDashboardHeader()
	{
		return DriverManager.getDriver().findElement(HDR_DASHBOARD).getText();
	}
 
	public String getPageTitle()
	{
		return DriverManager.getDriver().getTitle();
	}
 
	
}
