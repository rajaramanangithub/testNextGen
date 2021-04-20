package org.FrameworkTestNG;

import org.FWPojoTestNG.PojoTestNgFK;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testNGBase.libGlobalBase_backup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fkParaTests extends libGlobalBase_backup  {
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
	else{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
	driver.get("https://www.flipkart.com/account/login");
	}	
	
	@AfterMethod
	public void close() {
		 driver.quit();
	}

	@Test
	public void tc1() {

		PojoTestNgFK ptng=new PojoTestNgFK();
		toType(ptng.getFkmobile(), "123456");
		toType(ptng.getFkpass(), "tc1");
		toClick(ptng.getFklogin());
		
	}

}
