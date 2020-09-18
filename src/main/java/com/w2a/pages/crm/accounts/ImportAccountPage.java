package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.PageClass;

public class ImportAccountPage extends PageClass{
	
	public void gotoCreateAccounts()
	{
		driver.findElement(By.xpath("//i[@class='plus-plusi']")).click();
	}
	

}
