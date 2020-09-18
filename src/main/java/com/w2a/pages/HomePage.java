package com.w2a.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.PageClass;

public class HomePage extends PageClass {
	

	

	public void goToSupport()
	{
		driver.findElement(By.cssSelector(".signin>a:nt-child(2)")).click();

	}
	
	public void goToSignUp()
	{
		driver.findElement(By.xpath("//a[@class='zh-signup']")).click();

		
	}
	public LoginPage goToLogin()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		//driver.findElement(By.cssSelector(".signin")).click();
        System.out.println("go to Login method");
      
		click("loginLink_XPATH");
		return new LoginPage();
	}
	/*public void goToSupport()
	{
		
	}*/
	public void goToZohoEdu()
	{
		
	}
	public void goToLearnMore()
	{
		
	}
	public void vallidateFooterLink()
	{
		
	}
}
