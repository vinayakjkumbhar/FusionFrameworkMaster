package com.fusion.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.fusion.utility.*;
import com.fusion.pages.FusionLoginPage;

/*
 * @author Vinayak Kumbhar
 * 
 * This class will very the login for Fusion server. 
 * 
 * 
 * */

public class VerifyFusionLogin {

	WebDriver driver;

	@Test(priority=1,description="Valid User login successfully.")

	public void verifyValidUserLogin()
	{

		ConfigFileReader config=new ConfigFileReader();

		String chromePath=System.getProperty("user.dir")+File.separator+config.getChromeDriver();

		System.setProperty("webdriver.chrome.driver",chromePath);

		driver=new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println(config.getApplicationUrl());

		driver.get(config.getApplicationUrl());

		//	driver.findElement(By.xpath("//button[@id='details-button']")).click();
		//	driver.findElement(By.xpath("//a[@id='proceed-link']")).click();


		FusionLoginPage login=new FusionLoginPage(driver);

		login.enterUSerName();
		login.enterPassword();
		login.clickrememberMe();
		//login.clickforgotPassword();
		//login.clickClearButton();
		login.enterLoginButton();
		//driver.close();

	}
}
