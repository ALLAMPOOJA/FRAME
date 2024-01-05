package com.orange.testCases;

import org.testng.annotations.Test;

import com.orange.pageObject.LoginPage;

public class TC_LoginTest extends baseClass {
	
	@Test
	public void verifylogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.Username("Admin");
		lp.password("admin123");
		lp.Click();
	}
	

}
