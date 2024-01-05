package com.orange.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver=null;
	
	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	



	@FindBy(name="username")
	WebElement untxt;
	
	@FindBy(name="password")
	WebElement pwdtxt;
	
	@FindBy(xpath="//button[.=' Login ']")
	WebElement lgbtn;
	
	
	public void Username(String un)
	{
		untxt.sendKeys(un);
	}
	
	public void password(String pw)
	{
		pwdtxt.sendKeys(pw);
		
	}
	
	public void Click()
	{
		lgbtn.click();
	}


	


	

}
