package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.base.PageClass;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;
import com.w2a.testcases.BaseTest;

public class LoginTest extends BaseTest {


		
		@Test
		public void loginTest()
		{
			HomePage home = new HomePage();
	        LoginPage lp = home.goToLogin(); 		
	        ZohoAppPage zp=	lp.doLogin("monikazade16@gmail.com","abhimonika16");
		}
     /*   zp.goToCRM();
		AccountsPage account=PageClass.menu.goToAccounts();
		CreateAccountPage cp = account.goToCreateAccounts();
		cp.createAccounts("Raman");
		//home.goToSignUp();
*/		
		
		
	
}
