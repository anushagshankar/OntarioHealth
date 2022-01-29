package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;


import base.BaseClass;
import pagesClass.HomePage;
import pagesClass.LoginPage;

public class TC001Login extends BaseClass {

	
	
	@Test(priority=0)
	public void verifyLogin() {
	
	
		HomePage hp = new HomePage(driver);
		
		hp.doClickSingInbtn();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.doLogin("username", "password");
		
		String actual = driver.getTitle();
		String expected="Zero - Account Summary";
		
		Assert.assertEquals(actual, expected);
		
		
				
	}
	
	
}
