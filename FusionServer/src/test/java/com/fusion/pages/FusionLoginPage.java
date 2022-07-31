package com.fusion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * @author Vinayak Kumbhar
 * 
 * This class will store the all the locators and methods from the login page. 
 * 
 * 
 * */

public class FusionLoginPage {

	WebDriver driver;

	By username=By.id("UserName");
	By password=By.xpath("//input[@id='Password']");
	By loginbutton=By.xpath("//input[@id='btnLogin']");
	
	By rememberMe=By.xpath("//input[@id='RememberMe']");
	By forgotPassword=By.xpath("//span[@id='spnForgotPass']");
	By ClearButton=By.xpath("//input[@id='ClearButton']");
	

	

	public FusionLoginPage(WebDriver driver)
	{
		this.driver=driver;

	}
		
	public void enterUSerName()
	{
		driver.findElement(username).sendKeys("admin");
		
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("admin");
		
	}
	
	public void enterLoginButton()
	{
		driver.findElement(loginbutton).click();
				
	}
	
	
	public void clickrememberMe()
	{
		driver.findElement(rememberMe).click();
				
	}
	
	public void clickforgotPassword()
	{
		driver.findElement(forgotPassword).click();
				
	}
	
	public void clickClearButton()
	{
		driver.findElement(ClearButton).click();
				
	}
	
	
}
