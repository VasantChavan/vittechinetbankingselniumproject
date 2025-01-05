package com.vittech.inetbanking.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	public static Properties prop;
	
	public ConfigDataProvider(String filename)
	{
		try {
			File fs =new File("./Config/"+filename+".properties");
			FileInputStream fins =new FileInputStream(fs);
			
			prop = new Properties();
			prop.load(fins);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String getUserID()
	{
		return prop.getProperty("Userid");
	}
	
	public String getPasword()
	{
		return prop.getProperty("Password");
	}
	
	public String getAappURL()
	{
		return prop.getProperty("AppURL");
	}
	
	public String searchKey(String key)
	{
		return prop.getProperty(key);
	}
	
}
