package org.FrameworkTestNG;

import java.util.concurrent.TimeUnit;

import org.FWPojoTestNG.hotelPojo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testNGBase.libGlobalBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hotelAdactin extends libGlobalBase{
	
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
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
	 
	driver.get("http://adactinhotelapp.com/");
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}	
	
//	@AfterTest
//    public void quit() {
//        driver.manage().deleteAllCookies();
//        driver.quit();
//    }
	
	
	@Test(priority=2)
	public void login() {
		hotelPojo hp=new hotelPojo();
		fillText(hp.getTxtHUser(), "rajaramanan");
		fillText(hp.getTxtHPassword(), "ymS@86b572GDZ44");
		btnClick(hp.getBtnlogin());
	}
	
	@Test(priority=3)
	public void search() {
		hotelPojo hp=new hotelPojo();
		//toIteration(data, rowno, cellno)
		toSelectByValue(hp.getSelectlocation(), "London");
		toSelectByValue(hp.getSelecthotels(), "Hotel Sunshine");
		toSelectByValue(hp.getSelectroom_type(), "Standard");
		toSelectByValue(hp.getSelectroom_nos(), "1");
		toSelectByValue(hp.getSelectadult_room(), "1");
		toSelectByValue(hp.getSelectchild_room(), "1");
		btnClick(hp.getBtnSubmit());
		
	}
	
	@Test(priority=4)
	public void selectHotel() {
		hotelPojo hp=new hotelPojo();
		btnClick(hp.getradiobutton_0());
		//fillText(hp.gettotal_radiobutton(), "1");
		btnClick(hp.getBtncontinue());
	}
	
	@Test(priority=5)
	public void info() {
		hotelPojo hp=new hotelPojo();
		fillText(hp.getTxtfirst_name(), "Raja"); 
		fillText(hp.getTxtlast_name(), "Ramanan");
		fillText(hp.getTxtaddress(), "Hosur");
		fillText(hp.getTxtcc_num(), "1234567812345678");
		toSelectByValue(hp.getSelectcc_type(), "VISA");
		toSelectByValue(hp.getSelectcc_exp_month(), "1");
		toSelectByValue(hp.getSelectcc_exp_year(), "2021");
		fillText(hp.getTxtcc_cvv(), "123");
		btnClick(hp.getBtnbook_now());
	}
	
	@Test(priority=6)
	public void logout() {
		hotelPojo hp=new hotelPojo();
		btnClick(hp.getBtnLinkLogout());
	}
			

}
