package com.mstr.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mstr.config.Config;
import com.mstr.utillity.CloseBrowser;
import com.mstr.utillity.LanchApp;

public class Loginpg 

{
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
		WebElement objusernm;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
			WebElement objpass;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	 WebElement objclicklogpg;
	
	public void loadloginpg()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterusername(String usernm)
	{
		objusernm.sendKeys(usernm);
	}
	
	public void enterpassword(String pass)
	{
		 objpass.sendKeys(pass);	
	}
	
	public void clickonloginpg()
	{
		objclicklogpg.click();
	}

	public static void main(String[] args) throws Exception
	{
		
		LanchApp la=new LanchApp();
		
		la.openbrowser("chrome");
		la.enterApplicationurl("http://www.newtours.demoaut.com/mercurywelcome.php");
		la.maximisebrowser();
		la.waittillLoginpgLoadaed(15);
		
		Loginpg  lp=new Loginpg();
		
		lp.loadloginpg();
		lp.enterusername("vaishnavi");
		lp.enterpassword("9999");
		lp.clickonloginpg();
		
CloseBrowser cb=new CloseBrowser();
		
		cb.closebrowser();

	}

}
