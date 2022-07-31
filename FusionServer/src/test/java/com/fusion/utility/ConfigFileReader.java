package com.fusion.utility;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath= ".\\Configuration\\Config.properties";

	
	public ConfigFileReader()
	{
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
		
		
		
	}

	public String getChromeDriver()
	{
		String chromeDriverpath=properties.getProperty("cd1");
		
		if(chromeDriverpath!= null) 
			return chromeDriverpath;
		else 
			throw new RuntimeException("chromeDriverpath not specified in the Configuration.properties file.");		
			
	}
	
	public String getApplicationUrl()
	{
		String ServerUrl=properties.getProperty("ApplicationUrl");
		
		if(ServerUrl!= null) 
			return ServerUrl;
		else 
			throw new RuntimeException("Application URL not specified in the Configuration.properties file.");		
			
	}
	
	

}
