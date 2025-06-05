package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass{
	
	@Test
	public void testLogin() 
	{
		try
		{
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.SetUserName(rb.getString("username"));
		lp.SetPassword(rb.getString("password"));
		lp.ClickSubmit();;
		
		Thread.sleep(2000);
		
		
		 // Verify redirection to dashboard..
		
        boolean isRedirected = driver.getCurrentUrl().contains("/dashboard");
        Assert.assertTrue(isRedirected, "User should be redirected to dashboard");
		
		
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
		
	}

}
