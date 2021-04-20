package org.Parallel;

import org.testNGBase.libGlobalBase_backup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class greenPara extends libGlobalBase_backup {
	
	@Test
	public void launch() {
		chromeBrowser();
		launchUrl("http://www.greenstechnologys.com/");
	}
	
	@Test
	public void lauch1() {
		fireFoxBrowser();
		launchUrl("http://www.greenstechnologys.com/");
	}
	
	@Test
	public void lauch2() {
		ieBrowser();
		launchUrl("http://www.greenstechnologys.com/");
	}
	

}
