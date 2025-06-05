package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.LoginPage;
import pageObjects.DashboardPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_002_LoginDDT extends BaseClass{
	
	@Test(dataProvider= "Data",dataProviderClass=DataProviders.class)
	public void test_loginDDT(String username,String pwd,String exp) 
	{
		try
		{
		
		LoginPage lp=new LoginPage(driver);
		lp.SetUserName(username);
		lp.SetPassword(pwd);
		lp.ClickSubmit();;
		
		DashboardPage dash=new DashboardPage(driver);
		boolean target_page=dash.isDashboardPageExists();
		
		
		if(exp.equals("valid"))
		{
			if(target_page==true)
			{
				dash.clickUserDropdown();
				dash.clickLogout();;
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();
			}
		}
		
		if(exp.equals("invalid"))
		{
			if(target_page==true)
			{
				dash.clickUserDropdown();
				dash.clickLogout();
				Assert.fail();
			}
			else
			{
				Assert.assertTrue(true);
			}
		}

		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
