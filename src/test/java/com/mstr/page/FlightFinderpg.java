package com.mstr.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mstr.config.Config;
import com.mstr.utillity.CloseBrowser;
import com.mstr.utillity.LanchApp;




public class FlightFinderpg 
{

	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objFlightFinderimg;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objsignoff;
	
	public void loadpgFlightFinder()
	{
		PageFactory.initElements(Config.driver,this);
	}
	
	public void verifyFightFinderimg()
	{
		boolean flag=objFlightFinderimg.isDisplayed();
		
		System.out.println("fight finder image is display"+flag);
	}
	
	public void clickonsignoff() 
	
	{
		objsignoff.click();
	
	}
	
	public static void main(String[] args) throws Exception 
	{
		LanchApp la=new LanchApp();
		
		la.openbrowser("chrome");
		la.enterApplicationurl("http://www.newtours.demoaut.com/mercurywelcome.php");
		la.maximisebrowser();
		la.waittillLoginpgLoadaed(15);
		
		Loginpg lg=new Loginpg();
		
		lg.loadloginpg();
		lg.enterusername("vaishnavi");
		lg.enterpassword("9999");
	    lg.clickonloginpg();
		
		
		FlightFinderpg ff= new FlightFinderpg();
		
		ff.loadpgFlightFinder();
		ff.verifyFightFinderimg();
		ff.clickonsignoff();
		
		CloseBrowser cb=new CloseBrowser();
		
		cb.closebrowser();
				
		
		
	}

}