package com.saucedemo.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By filter_button = By.xpath("//select[@class='product_sort_container']");
	private By select_dropdown = By.xpath("//option[@value='lohi']");
	private By product_img = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");

	public void clickOnFilterButton()
	{
		driver.findElement(filter_button).click();
		
	}
	
	public void clickOnPriceLowToHaighOption()
	{
		driver.findElement(select_dropdown).click();
	}
	
	public void ClickOnAddtoCart()
	{
		driver.findElement(product_img).click();
	}

}
