package org.Parallel;

import org.FWPojoTestNG.PojoTestNgFK;
import org.testNGBase.libGlobalBase_backup;
import org.testng.annotations.Test;

public class FkParallel extends libGlobalBase_backup {
	
	@Test
	public void launch() {
		chromeBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		PojoTestNgFK ptng=new PojoTestNgFK();
		toType(ptng.getFkmobile(), "123456");
		toType(ptng.getFkpass(), "tc1");
		toClick(ptng.getFklogin());
	}
	
	@Test
	public void lauch1() {
		fireFoxBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		PojoTestNgFK ptng=new PojoTestNgFK();
		toType(ptng.getFkmobile(), "22222222");
		toType(ptng.getFkpass(), "tc2");
		toClick(ptng.getFklogin());
	}
	
	@Test
	public void lauch2() {
		ieBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		PojoTestNgFK ptng=new PojoTestNgFK();
		toType(ptng.getFkmobile(), "33333333");
		toType(ptng.getFkpass(), "tc3");
		toClick(ptng.getFklogin());
	}
	

}
