package com.saucedemo.testlayer;

import org.testng.annotations.Test;

import com.saucedemo.pagelayer.LoginPage;
import com.saucedemo.testbase.TestBase;

public class LoginTest extends TestBase
{
	@Test
	public void validateLoginPage()
	{
		 LoginPage obj =  new LoginPage(driver);
		 obj.enterUsername("standard_user");
		 obj.enterpassword("secret_sauce");
		 obj.clickOnLoginButton();
		 
	}



}
