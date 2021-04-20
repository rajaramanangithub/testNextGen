package org.FWPojoTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testNGBase.libGlobalBase_backup;

public class hotelPojo extends libGlobalBase_backup {
	
	public hotelPojo(){
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getTxtHUser() {
		return txtHUser;
	}

	public WebElement getTxtHPassword() {
		return txtHPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getSelectlocation() {
		return selectlocation;
	}

	public WebElement getSelecthotels() {
		return selecthotels;
	}

	public WebElement getSelectroom_type() {
		return selectroom_type;
	}
	
	public WebElement getSelectroom_nos() {
		return selectroom_nos;
	}
	
	public WebElement getDatedatepick_in() {
		return datedatepick_in;
	}

	public WebElement getDatedatepick_out() {
		return datedatepick_out;
	}

	public WebElement getSelectadult_room() {
		return selectadult_room;
	}

	public WebElement getSelectchild_room() {
		return selectchild_room;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement gettotal_radiobutton() {
		return radiototal_radiobutton;
	}
	
	public WebElement getradiobutton_0() {
		return radioradiobutton_0;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public WebElement getTxtfirst_name() {
		return txtfirst_name;
	}

	public WebElement getTxtlast_name() {
		return txtlast_name;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtcc_num() {
		return txtcc_num;
	}

	public WebElement getSelectcc_type() {
		return selectcc_type;
	}

	public WebElement getSelectcc_exp_month() {
		return selectcc_exp_month;
	}

	public WebElement getSelectcc_exp_year() {
		return selectcc_exp_year;
	}

	public WebElement getTxtcc_cvv() {
		return txtcc_cvv;
	}

	public WebElement getBtnbook_now() {
		return btnbook_now;
	}

	public WebElement getBtnlogout() {
		return btnlogout;
	}

	public WebElement getBtnLinkLogout() {
		return btnLinkLogout;
	}

	@FindBy(id="username")
	private WebElement txtHUser;
	
	@FindBy(id="password")
	private WebElement txtHPassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;
	
	@FindBy(id="location")
	private WebElement selectlocation;
	
	@FindBy(id="hotels")
	private WebElement selecthotels;
	
	@FindBy(id="room_type")
	private WebElement selectroom_type;
	
	@FindBy(id="room_nos")
	private WebElement selectroom_nos;

	@FindBy(id="datepick_in")
	private WebElement datedatepick_in;
	
	@FindBy(id="datepick_out")
	private WebElement datedatepick_out;
	
	@FindBy(id="adult_room")
	private WebElement selectadult_room;
	
	@FindBy(id="child_room")
	private WebElement selectchild_room;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	@FindBy(id="total_radiobutton")
	private WebElement radiototal_radiobutton;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioradiobutton_0;
	
	@FindBy(id="continue")
	private WebElement btncontinue;
	
	@FindBy(id="first_name")
	private WebElement txtfirst_name;
	
	@FindBy(id="last_name")
	private WebElement txtlast_name;
	
	@FindBy(id="address")
	private WebElement txtaddress;
	
	@FindBy(id="cc_num")
	private WebElement txtcc_num;
	
	@FindBy(id="cc_type")
	private WebElement selectcc_type;
	
	@FindBy(id="cc_exp_month")
	private WebElement selectcc_exp_month;
	
	@FindBy(id="cc_exp_year")
	private WebElement selectcc_exp_year;
	
	@FindBy(id="cc_cvv")
	private WebElement txtcc_cvv;
	
	@FindBy(id="book_now")
	private WebElement btnbook_now;
	
	@FindBy(id="logout")
	private WebElement btnlogout;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	private WebElement btnLinkLogout;
	

}
