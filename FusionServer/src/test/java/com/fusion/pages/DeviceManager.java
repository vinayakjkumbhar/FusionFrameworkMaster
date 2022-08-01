package com.fusion.pages;
/*
 * @author Vinayak Kumbhar
 * 
 * This class will store the all the locators and methods from the Device Manager page. 
 * 
 * 
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeviceManager {
	
	WebDriver driver;
	//deleted int variable 
	
	
	By logoutbutton=By.xpath("//a[@id='HeadLoginStatus']");
	By clickok=By.xpath("//input[@id='btnAlertLogOut']");
	
	
	public DeviceManager(WebDriver driver)
	{
		this.driver= driver;
	
	}
	
	public void clicklogoutbutton()
	{
		WebDriverWait wdwait=new WebDriverWait(	driver,50);
		WebElement wl=wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='HeadLoginStatus']")));
		wl.click();
		//driver.findElement(logoutbutton).click();
				
	}
	
	public void confirmok()
	{
		driver.findElement(clickok).click();
				
	}
	

}
