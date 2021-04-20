package org.FrameworkTestNG;

import org.FWPojoTestNG.PojoTestNgFK;
import org.FWPojoTestNG.gmailPojo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testNGBase.libGlobalBase_backup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmailCross extends libGlobalBase_backup {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void browser(String browserName)
	{
	if(browserName.equals("chrome")){
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox")){
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	}
	 
	driver.get("https://accounts.google.com/signin/v2/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}	
	
	@Test
	public void tc1() {
		gmailPojo gmpojo=new gmailPojo();
		toType(gmpojo.getGmail(), "rajaramananacecse");
		toClick(gmpojo.getBtnNext1());
		toType(gmpojo.getPassword(), "foracecse");
		toClick(gmpojo.getBtnNext2());
	}


}
