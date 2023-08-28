package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.annotations.FrameworkAnnotations;
import com.cs.pages.HomePage;
import com.cs.pages.LoginPage;

public class LoginTest extends BaseTest{
	// test script: should have assert
	
	
	@FrameworkAnnotations(author = "Kattapa",category = "regression")
	@Test(description="Verifying login test")
	public void verifyLoginTest()
	{
		LoginPage loginPage = new LoginPage();
		HomePage homePage = loginPage.enterLoginDetails("Admin", "admin123");
		
		String actPageHeader = homePage.getDashboardHeader();
		String expPageHeader = "Dashboard";
		Assert.assertEquals(expPageHeader,actPageHeader, "Page Header does not match !");
	}
}
