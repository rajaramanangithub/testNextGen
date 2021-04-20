package org.FWPojoTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testNGBase.libGlobalBase_backup;

public class FWPojoTestNG extends libGlobalBase_backup {
	
	public FWPojoTestNG(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="email")
	private WebElement txtUser;
	
	@FindBy(id="pass")
	private WebElement txtPass;
		
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement btnLogin;
	
	public WebElement getTxtUser() {
		return txtUser;
	}	
	public WebElement getTxtPass() {
		return txtPass;
	}	
	public WebElement getBtnLogin() {
		return btnLogin;
		
	}
	

}
