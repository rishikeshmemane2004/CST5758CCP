package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.annotations.FrameworkAnnotations;
import com.cs.pages.CustomerPage;
import com.cs.pages.HomePage;
import com.cs.pages.LoginPage;

public class HomeTest extends BaseTest {
 
	@FrameworkAnnotations(author = "Bahubali",category = "smoke")
	@Test(description="Verifying Home page title")
	public void verifyHomeTitleTest()
	{
		LoginPage loginPage = new LoginPage();
		HomePage homePage = loginPage.enterLoginDetails("Admin", "admin123");
		
		String actPageTitle  = homePage.getPageTitle();
		String expPageHeader = "OrangeHRM";
		Assert.assertEquals(expPageHeader,actPageTitle, "Page title does not match !");
	}
	
	@FrameworkAnnotations(author = {"Rajmata","Shivgami"},category = "regression")
	@Test(description="Verifying Customer added")
	public void verifyNewCustomerTest()
	{
		LoginPage loginPage = new LoginPage();
		HomePage homePage = loginPage.enterLoginDetails("Admin", "admin123");
		
		String actPageHeader = homePage.getDashboardHeader();
		String expPageHeader = "Dashboard";
		Assert.assertEquals(expPageHeader,actPageHeader, "Page Header does not match !");
		
		homePage.clickOnPIM();
		CustomerPage customerPage = homePage.clickOnADDBTN();
		customerPage.enterCustomerDetails("DevSena"+System.currentTimeMillis(), "Kalkeya"+System.currentTimeMillis(), "Kalki"+System.currentTimeMillis());
		customerPage.clickOnSaveBtn();
		
		// assertion for save record successfully
	}
}
