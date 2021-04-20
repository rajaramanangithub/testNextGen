package org.Parallel;

import org.FWPojoTestNG.PojoTestNgFK;
import org.FWPojoTestNG.gmailPojo;
import org.testNGBase.libGlobalBase_backup;
import org.testng.annotations.Test;

public class gmailParallel extends libGlobalBase_backup {
	@Test
	public void launch() {
		chromeBrowser();
		launchUrl("https://accounts.google.com/signin/v2/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		gmailPojo gmpojo=new gmailPojo();
		toType(gmpojo.getGmail(), "rajaramananacecse");
		toClick(gmpojo.getBtnNext1());
		toType(gmpojo.getPassword(), "foracecse");
		toClick(gmpojo.getBtnNext2());
	}
	
	@Test
	public void lauch1() {
		fireFoxBrowser();
		launchUrl("https://accounts.google.com/signin/v2/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		gmailPojo gmpojo=new gmailPojo();
		toType(gmpojo.getGmail(), "rajaramananacecse");
		toClick(gmpojo.getBtnNext1());
		toType(gmpojo.getPassword(), "foracecse");
		toClick(gmpojo.getBtnNext2());
	}
	
	

}
