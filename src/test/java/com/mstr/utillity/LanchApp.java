package com.mstr.utillity;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.mstr.config.Config;



public class LanchApp 
{
	
	Properties prop =new Properties();

	   
	   public void openbrowser(String brosernm) throws Exception 
	   {
		   FileInputStream fis=new FileInputStream("D:\\Testingworkplace\\Mercury_Pom\\scr\\test\\resources\\Config.property");
		   
		   System.out.println(fis);
		   prop.load(fis);
		   
		   if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		   {
			   System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeexepath"));
			   Config.driver =new ChromeDriver();
			   
			   System.out.println("chrome browser is open succsessfully");
			   
		   }
		   
		   else
			   
			   if(prop.getProperty("browser").equalsIgnoreCase("ie"))
		   
		   {
			   System.setProperty("webdriver.ie.driver",prop.getProperty("ieexepath"));
			   
			   Config.driver= new InternetExplorerDriver();
			   
			   System.out.println("ie browser is open sucssesfully");
		   }
	   }
		   public void enterApplicationurl(String url)
		   {
			   Config.driver.get(url);
		   }
		   
		   public void maximisebrowser()
		   {
			   Config.driver.manage().window().maximize();
			   
		   }
		   
		   public void waittillLoginpgLoadaed(int timeoutsec)
		   {
			  Config.driver.manage().timeouts().pageLoadTimeout(timeoutsec, TimeUnit.SECONDS);
		   }
		   
		
		public static void main(String[] args) throws Exception 
		{
			LanchApp la=new LanchApp();
			
			la.openbrowser("chrome");
			la.enterApplicationurl("http://www.newtours.demoaut.com/mercurywelcome.php");
			la.maximisebrowser();
			la.waittillLoginpgLoadaed(15);
			
		}
						
		}