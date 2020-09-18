package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {

	WebDriver driver;
	public TopMenu(WebDriver driver)
	{
		this.driver = driver;
	}
	public void goToHome()
	{
		
	}
	public void goToFeeds()
	{
		
	}
	public void goToLeads()
	{
		
	}
	public AccountsPage goToAccounts()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		return new AccountsPage();
	}
	public void goToContacts()
	{
		
	}
	public void signOut()
	{
		
	}
}
