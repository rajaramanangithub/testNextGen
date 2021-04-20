package org.FrameworkTestNG;

import org.testng.annotations.Test;
import org.FWPojoTestNG.FWPojoTestNG;
import org.testNGBase.libGlobalBase_backup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FWTestNG extends libGlobalBase_backup {
	@BeforeMethod
	public void launch() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void close() {
		 driver.quit();
	}
	
	@Test(priority=2)
	public void tc1() {

		FWPojoTestNG ptng=new FWPojoTestNG();
		toType(ptng.getTxtUser(), "tc1");
		toType(ptng.getTxtPass(), "tc1");
		toClick(ptng.getBtnLogin());
		
	}
	
	@Test(priority=1)
	public void tc3() {
		FWPojoTestNG ptng=new FWPojoTestNG();
		toType(ptng.getTxtUser(), "tc3");
		toType(ptng.getTxtPass(), "tc3");
		toClick(ptng.getBtnLogin());

	}
	
	@Test(priority=-2)
	public void tc4() {

		FWPojoTestNG ptng=new FWPojoTestNG();
		toType(ptng.getTxtUser(), "tc4");
		toType(ptng.getTxtPass(), "tc4");
		toClick(ptng.getBtnLogin());
		
	}
	
	@Test
	public void tc5() {

		FWPojoTestNG ptng=new FWPojoTestNG();
		toType(ptng.getTxtUser(), "tc5");
		toType(ptng.getTxtPass(), "tc5");
		toClick(ptng.getBtnLogin());
		
	}
	
	@Test(priority=-3)
	public void tc2() {

		FWPojoTestNG ptng=new FWPojoTestNG();
		toType(ptng.getTxtUser(), "tc2");
		toType(ptng.getTxtPass(), "tc2");
		toClick(ptng.getBtnLogin());
		
	}
	


}
