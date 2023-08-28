package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.enums.WaitType;

import SeleniumUtils.Utils;

public class CustomerPage {

	
	private static final By FIRSTNAME  =  By.name("firstName");
	private static final By MIDDLENAME =  By.name("middleName");
	private static final By LASTNAME   =  By.name("lastName");
	private static final By BTN_SAVE   =  By.xpath("//button[@type='submit']");
	
	public void clickOnSaveBtn()
	{
		Utils.clickElement(BTN_SAVE, WaitType.CLICKABLE, "SAVE BUTTON");
	}
	
	private CustomerPage enterFirstName(String fName)
	{
		Utils.type(FIRSTNAME, fName, WaitType.PRESENCE, "FIRSTNAME");
		//return new CustomerPage();
		return this;
	}
	private CustomerPage enterMiddleName(String mName)
	{
		Utils.type(MIDDLENAME, mName, WaitType.PRESENCE, "MIDDLENAME");
		return this;
	}
	private  CustomerPage enterLastName(String lName)
	{
		Utils.type(LASTNAME, lName, WaitType.PRESENCE, "LASTNAME");
		return this;
	}
	
	public void enterCustomerDetails(String fName, String mName,String lName)
	{
		enterFirstName(fName).
		enterMiddleName(mName).
		enterLastName(lName);
	}
	
	
	
	
	
	
	
	
}
