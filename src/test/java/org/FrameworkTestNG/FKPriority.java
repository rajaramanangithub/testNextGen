package org.FrameworkTestNG;

import org.testng.annotations.Test;
import org.FWPojoTestNG.PojoTestNgFK;
import org.testNGBase.libGlobalBase_backup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FKPriority extends libGlobalBase_backup {
	@BeforeMethod
	public void launch() {
		chromeBrowser();
		launchUrl("https://www.flipkart.com/account/login");
	}
	
	@AfterMethod
	public void close() {
		 driver.quit();
	}
	
	@Test(priority=2)
	public void tc1() {

		PojoTestNgFK ptng=new PojoTestNgFK();
		toType(ptng.getFkmobile(), "123456");
		toType(ptng.getFkpass(), "tc1");
		toClick(ptng.getFklogin());
		
	}
	
	@Test(priority=-2)
	public void tc2() {

		PojoTestNgFK ptng=new PojoTestNgFK();
		toType(ptng.getFkmobile(), "22222222");
		toType(ptng.getFkpass(), "tc2");
		toClick(ptng.getFklogin());
		
	}
	
	@Test
	public void tc3() {

		PojoTestNgFK ptng=new PojoTestNgFK();
		toType(ptng.getFkmobile(), "33333333");
		toType(ptng.getFkpass(), "tc3");
		toClick(ptng.getFklogin());
		
	}	
	

}
