package com.saucedemo.testlayer;

import org.testng.annotations.Test;

import com.saucedemo.pagelayer.HomePage;
import com.saucedemo.testbase.TestBase;

public class HomeTest extends TestBase
{
   @Test
   public void validateAddToCartButton()
   {
	   HomePage home_obj = new HomePage(driver);
	   home_obj.clickOnFilterButton();
	   home_obj.clickOnPriceLowToHaighOption();
	   home_obj.ClickOnAddtoCart();
	   
   }
}
