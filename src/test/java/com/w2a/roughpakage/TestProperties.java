package com.w2a.roughpakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	
	public static void main(String[] args)  {
		
		
		try {
			Properties configData = new Properties();
			//FileInputStream fis = new FileInputStream("config.properties");
			//configData.load(fis);
			//String FromUser = (String) configData.get("FromUser");
			//String Password = (String) configData.get("Password");
			//String ToList = (String) configData.get("ToList");
			Properties config = new Properties();
			
			Properties OR = new Properties();
			
			//System.setProperty("user.dir", "C:\\Users\\user\\Desktop\\Latestproject\\DataDrivenFramework");
			
			System.out.println(System.getProperty("user.dir"));
			

			//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");

			//E:\UDEMY\ProjectDevelopment\Latestproject\pageObjectModel\src\test\resources\properties\OR.properties
			config.load(fis);
			
			//fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			fis = new FileInputStream("E:\\UDEMY\\ProjectDevelopment\\Latestproject\\pageObjectModel\\src\\test\\resources\\properties\\OR.properties");

			OR.load(fis);
			String loginLink_xpath = (String)configData.get("loginLink_xpath");
			//String Password = (String) configData.get("Password");
			System.out.println("loginLink_xpath-------------------+"+loginLink_xpath);
			System.out.println(config.getProperty("browser"));
			
			//System.out.println(OR.getProperty("bmlBtn_CSS"));

			
			//driver.findElement(By.cssSelector(OR.getProperty("bmlBtn_CSS"))).click();
			
		}
		
		catch (FileNotFoundException e) 
		
		{
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
			System.out.println("1");
			

		} catch (IOException e)
		
		{
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		
			
			System.out.println("2");

		}
	}

}
