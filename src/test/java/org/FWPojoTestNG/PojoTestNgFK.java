package org.FWPojoTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testNGBase.libGlobalBase_backup;

public class PojoTestNgFK extends libGlobalBase_backup{
	
	public PojoTestNgFK(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement fkmobile;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement fkpass;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement fklogin;

	public WebElement getFkmobile() {
		return fkmobile;
	}
	public WebElement getFkpass() {
		return fkpass;
	}
	public WebElement getFklogin() {
		return fklogin;
	}

}
