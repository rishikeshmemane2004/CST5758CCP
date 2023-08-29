package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.annotations.FrameworkAnnotations;
import com.cs.pages.CustomerPage;
import com.cs.pages.HomePage;
import com.cs.pages.LoginPage;
import com.github.javafaker.Faker;

public class CustomerTest extends BaseTest{

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
	Faker faker = new Faker();
	String ffName = faker.name().firstName();
	String fmName = faker.name().firstName();
	String flName = faker.name().lastName();
	customerPage.enterCustomerDetails(ffName, fmName, flName);
	System.out.println("ffName" + ffName);
	System.out.println("fmName" + fmName);
	System.out.println("flName" + flName);
		
/*		customerPage.enterCustomerDetails("DevSena"+System.currentTimeMillis(), "Kalkeya"+System.currentTimeMillis(), "Kalki"+System.currentTimeMillis());
*/	
		
		customerPage.clickOnSaveBtn();
		
		// assertion for save record successfully
	}
	
	
	
}
