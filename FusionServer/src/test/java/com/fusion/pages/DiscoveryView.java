package com.fusion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiscoveryView {
	
	WebDriver driver;
	
	
	By discoveryButton=By.xpath("//a[@id='imgBtnDiscoverClient']");

	
	
	public DiscoveryView(WebDriver driver)
	{
		this.driver= driver;
	
	}

}
