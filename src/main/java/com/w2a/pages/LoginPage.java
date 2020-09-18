package com.w2a.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.PageClass;

public class LoginPage extends PageClass {

	public ZohoAppPage doLogin(String username,String password)
	{
		//driver.switchTo().frame("zohoiam");
		System.out.println("In doLogin System");
		type("username_XPATH",username);
		click("nextbtn1_XPATH");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		type("password_XPATH",password);
		click("signbtn_XPATH");
		
	
		
        System.out.println("Login Susccesfully");
		return new ZohoAppPage();
	}
	public void goToSaleandMarketing()
	{
		
	}
}
