package org.FWPojoTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testNGBase.libGlobalBase_backup;

public class gmailPojo extends libGlobalBase_backup {
	
	public gmailPojo(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getGmail() {
		return gmail;
	}

	public WebElement getBtnNext1() {
		return btnNext1;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnNext2() {
		return btnNext2;
	}

	@FindBy(id="identifierId")
	private WebElement gmail;
	
	@FindBy(id="identifierNext")
	private WebElement btnNext1;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="identifierNext")
	private WebElement btnNext2;
	

}
