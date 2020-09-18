package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.PageClass;

public class CreateAccountPage extends PageClass {

     public CreateAccountPage createAccounts(String accountName)
	{
		driver.findElement(By.xpath("//button[@class='customPlusBtn cP']")).sendKeys(accountName);
		return new CreateAccountPage();
		
		
	}


	

	
	
}
