package org.testNGBase;

import java.awt.List;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class libGlobalBase_backup {
	public static WebDriver driver;
	public static JavascriptException jse;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static TakesScreenshot tss=(TakesScreenshot) driver;
	public static Select s;
	public static void configureBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	public static void fireFoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
	
	public static void ieBrowser() {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void toMaxWin() {
		driver.manage().window().maximize();
	}
	public static void getTitle(String url) {
		driver.getTitle();
	}
		
	public static void toType(WebElement ele, String value) {
		 ele.sendKeys(value);
		
	}
	public static void toClick(WebElement ele) {
		 ele.click();
		
	}
	public static void togetText(WebElement e) {
		String t = e.getText();	
		System.out.println(t);
	}
	public static void gettingAttribute(WebElement e, String s) {
		System.out.println(e.getAttribute(s));
	}
	
	public static void toMovetToElement(WebElement e) {
		a=new Actions(driver);
		a.moveToElement(e).perform();

	}
	public static void doubleClicking(WebElement e) {
		a=new Actions(driver);
		a.doubleClick(e).perform();
	}
	public static void contextClicking(WebElement e) {
		a=new Actions(driver);
		a.contextClick(e).perform();
	}
	public static void toScrollDown(WebElement e) {
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	public static void toScrollUp(WebElement e) {
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}
		
	public static void toTakeScreenShots(WebElement e,String name) throws IOException {
		js=(JavascriptExecutor) driver;
		tss=(TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\eclipse-workspace\\SampleMavenProject\\ScreenShots\\"+name+".png");
		FileUtils.copyFile(src, des);
	}
		
	public static void toSelectByValue(WebElement e, String value) {
		s=new Select(e);
		s.selectByValue(value);
	}
		
	public static void toSelectByIndex(WebElement e, int n) {
		s=new Select(e);
		s.selectByIndex(n);
	}
		
	public static void toSelectByVisibleText(WebElement e, String txt) {
		s=new Select(e);
		s.selectByVisibleText(txt);
	}
		
	public static void toGetFirstSelectedOption(WebElement e) {
		s=new Select(e);
		WebElement fso = s.getFirstSelectedOption();
		System.out.println(fso.getText());
	}
	public static void toDeSelectAll(WebElement e) {
		s=new Select(e);
		s.deselectAll();
	}
		
}

