package com.mstr.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mstr.config.Config;
import com.mstr.utillity.LanchApp;

public class Registrationpg 

{

	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement objfirstnm;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement objlastnm;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	WebElement objphonno;
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objemail;
	
    @FindBy(how=How.XPATH,using="//input[@name='address1']")
	WebElement objaddress;
    
    @FindBy(how=How.XPATH,using="//input[@name='city']")
   	 WebElement objcity;
    
    @FindBy(how=How.XPATH,using="//input[@name='state']")
  	 WebElement objstate;
    
     @FindBy(how=How.XPATH,using="//input[@name='postalCode']")
  	 WebElement objpin;
     
     @FindBy(how=How.XPATH,using="//select[@name='country']")
  	 WebElement objcountry;
     
     @FindBy(how=How.XPATH,using="//input[@name='email']")
  	 WebElement objusername;
     
     @FindBy(how=How.XPATH,using="//input[@name='password']")
  	 WebElement objpassword;
     
     @FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
  	 WebElement objconpassword;
     
     @FindBy(how=How.XPATH,using="//input[@name='register']")
  	 WebElement objregister;
     
     public void loadregistrationpg()
     {
    	 PageFactory.initElements(Config.driver, this);
     }
     
     public void enterfirstname(String firstnm)
     {
    	 objfirstnm.sendKeys(firstnm);
     }
     
     public void enterlastname(String lastnm)
     {
    	 objlastnm.sendKeys(lastnm);
     }
    
     public void enterphoneno(String phono)
     {
    	 objphonno.sendKeys(phono);
     }
     
     public void entermailid(String mailid)
     {
    	 objemail.sendKeys(mailid);
     }
   
     public void enteraddress(String add)
     {
    	 objaddress.sendKeys(add);
     }
   
     public void entercity(String cit)
     {
    	 objcity.sendKeys(cit);
     }
       
     public void enterstate(String sta)
     {
    	 objstate.sendKeys(sta);
     }
     
     public void enterpostalcode(String code)
     {
    	 objpin.sendKeys(code);
     }
     
     public void entercountry(String county)
     {
    	 objcountry.sendKeys(county);
     }
     
     public void enterusernm(String unm)
     {
    	 objusername.sendKeys(unm);
     }
     
     public void enterpass(String psw)
     {
    	 objpassword.sendKeys(psw);
     }
     
     public void enterconpass(String conpwd)
     {
    	 objconpassword.sendKeys(conpwd);
     }
     
     public void clicksubmit()
     {
    	 objregister.click();	 
     }
	public static void main(String[] args) throws Exception
	
	{
		
         LanchApp la=new LanchApp();
		
		la.openbrowser("chrome");
		la.enterApplicationurl("http://www.newtours.demoaut.com/mercuryregister.php?osCsid=d21d1a2ffde682efe2c2e01293190cc2");
		la.maximisebrowser();
		la.waittillLoginpgLoadaed(15);
		
		Registrationpg rp=new Registrationpg();
		
		rp.loadregistrationpg();
		rp.enterfirstname("vaishnavi");
		rp.enterlastname("pachkhande");
		rp.enterphoneno("9511603473");
		rp.entermailid("ms.vaishnavipachkhande15@gmail.com");
		rp.enteraddress("kalpataru colony,warje naka");
		rp.entercity("pune");
		rp.enterstate("maharastra");
		rp.enterpostalcode("411052");
		rp.entercountry("india");
		rp.enterusernm("vaishnavi");
		rp.enterpass("9999");
		rp.enterconpass("9999");
		rp.clicksubmit();
		
		
	}

}
