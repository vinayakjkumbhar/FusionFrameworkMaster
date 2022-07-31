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

public class DeviceManager {
	
	WebDriver driver;
 int i=0;
	By username=By.id("UserName");
	By password=By.xpath("//input[@id='Password']");
	By loginbutton=By.xpath("//input[@id='btnLogin']");
	By rememberMe=By.xpath("//input[@id='RememberMe']");
	By ClearButton=By.xpath("//input[@id='ClearButton']");
	By forgotPassword=By.xpath("//span[@id='spnForgotPass']");

	

}
