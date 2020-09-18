package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.PageClass;
import com.w2a.base.TopMenu;

public class AccountsPage extends PageClass{

	
	public CreateAccountPage goToCreateAccounts( )
	{
		driver.findElement(By.xpath("//button[@class='customPlusBtn cP']")).click();
		return new CreateAccountPage();
		
		
	}
	public CreateAccountPage goToImportAccounts()
	{
		driver.findElement(By.xpath("//lyte-yield[text()='Import']")).click();
		return new CreateAccountPage();
	}

}
