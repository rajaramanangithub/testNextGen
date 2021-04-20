package org.testNGBase;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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



public class libGlobalBase {
public static WebDriver driver;
public static Actions ac;
public static Robot rc;
public static Alert al;
public static JavascriptExecutor js;
public static TakesScreenshot tss=(TakesScreenshot) driver;
public static Select s1;
public static Sheet s;
public static Row r;
public static Cell c;
public static String v1;
public static WebDriver chromeBrowser() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
return driver;
}

public static void fireFoxBrowser() {
WebDriverManager.firefoxdriver().setup();
driver=new FirefoxDriver();
}

public static void ieBrowser() {
WebDriverManager.iedriver().setup();
driver=new InternetExplorerDriver();
}

public static void urlLaunch(String url) {
driver.get(url);
}

public static void fillText(WebElement ele, String text) {
ele.sendKeys(text);
}

public static void btnClick(WebElement e) {
e.click();
}

public static void gettingText(WebElement e) {
System.out.println(e.getText());
}

public static void gettingAttribute(WebElement e, String s) {
System.out.println(e.getAttribute(s));
}

public static void movingToElement(WebElement e) {
ac=new Actions(driver);
ac.moveToElement(e).perform();
}

public static void dragingAndDrop(WebElement src, WebElement des) {
ac=new Actions(driver);
ac.dragAndDrop(src, des).perform();
}

public static void doubleClicking(WebElement e) {
ac=new Actions(driver);
ac.doubleClick(e).perform();
}

public static void contextClicking(WebElement e) {
ac=new Actions(driver);
ac.contextClick(e).perform();
}

public static void toMaximizeWindow() {
driver.manage().window().maximize();
}

public static void pressTab() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_TAB);
rc.keyRelease(KeyEvent.VK_TAB);
}

public static void pressEnter() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_ENTER);
rc.keyRelease(KeyEvent.VK_ENTER);
}

public static void selectText() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_CONTROL);
rc.keyRelease(KeyEvent.VK_CONTROL);
rc.keyPress(KeyEvent.VK_A);
rc.keyRelease(KeyEvent.VK_A);
}

public static void copyText() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_CONTROL);
rc.keyRelease(KeyEvent.VK_CONTROL);
rc.keyPress(KeyEvent.VK_C);
rc.keyRelease(KeyEvent.VK_C);
}

public static void pasteText() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_CONTROL);
rc.keyRelease(KeyEvent.VK_CONTROL);
rc.keyPress(KeyEvent.VK_V);
rc.keyRelease(KeyEvent.VK_V);
}

public static void cutText() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_CONTROL);
rc.keyRelease(KeyEvent.VK_CONTROL);
rc.keyPress(KeyEvent.VK_X);
rc.keyRelease(KeyEvent.VK_X);
}

public static void pressA() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_A);
rc.keyRelease(KeyEvent.VK_A);
}

public static void pressB() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_B);
rc.keyRelease(KeyEvent.VK_B);
}

public static void pressE() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_E);
rc.keyRelease(KeyEvent.VK_E);
}

public static void pressC() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_C);
rc.keyRelease(KeyEvent.VK_C);
}

public static void pressD() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_D);
rc.keyRelease(KeyEvent.VK_D);
}

public static void pressF() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_F);
rc.keyRelease(KeyEvent.VK_F);
}

public static void pressG() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_G);
rc.keyRelease(KeyEvent.VK_G);
}

public static void pressH() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_H);
rc.keyRelease(KeyEvent.VK_H);
}

public static void pressI() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_I);
rc.keyRelease(KeyEvent.VK_I);
}

public static void pressJ() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_J);
rc.keyRelease(KeyEvent.VK_J);
}

public static void pressK() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_K);
rc.keyRelease(KeyEvent.VK_K);
}

public static void pressL() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_L);
rc.keyRelease(KeyEvent.VK_L);
}

public static void pressM() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_M);
rc.keyRelease(KeyEvent.VK_M);
}

public static void pressN() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_N);
rc.keyRelease(KeyEvent.VK_N);
}

public static void pressO() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_O);
rc.keyRelease(KeyEvent.VK_O);
}

public static void pressP() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_P);
rc.keyRelease(KeyEvent.VK_P);
}

public static void pressQ() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_Q);
rc.keyRelease(KeyEvent.VK_Q);
}

public static void pressR() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_R);
rc.keyRelease(KeyEvent.VK_R);
}

public static void pressS() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_S);
rc.keyRelease(KeyEvent.VK_S);
}

public static void pressT() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_T);
rc.keyRelease(KeyEvent.VK_T);
}

public static void pressU() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_U);
rc.keyRelease(KeyEvent.VK_U);
}

public static void pressV() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_V);
rc.keyRelease(KeyEvent.VK_V);
}

public static void pressW() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_W);
rc.keyRelease(KeyEvent.VK_W);
}

public static void pressX() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_X);
rc.keyRelease(KeyEvent.VK_X);
}

public static void pressY() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_Y);
rc.keyRelease(KeyEvent.VK_Y);
}

public static void pressZ() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_Z);
rc.keyRelease(KeyEvent.VK_Z);
}

public static void pressShift() throws AWTException {
rc=new Robot();
rc.keyPress(KeyEvent.VK_SHIFT);
rc.keyRelease(KeyEvent.VK_SHIFT);
}

public static void acceptAlert() throws InterruptedException {
al=driver.switchTo().alert();
Thread.sleep(3000);
al.accept();
}

public static void dismissAlert() throws InterruptedException {
al=driver.switchTo().alert();
Thread.sleep(3000);
al.dismiss();
}

public static void accepAlertWithSendkeys(String s) throws InterruptedException {
al=driver.switchTo().alert();
Thread.sleep(3000);
al.sendKeys(s);
System.out.println(al.getText());
al.accept();
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
s1=new Select(e);
s1.selectByValue(value);
}

public static void toSelectByIndex(WebElement e, int n) {
s1=new Select(e);
s1.selectByIndex(n);
}

public static void toSelectByVisibleText(WebElement e, String txt) {
s1=new Select(e);
s1.selectByVisibleText(txt);
}

public static void toGetOptions(WebElement e) {
s1=new Select(e);
List<WebElement> options = s1.getOptions();
for (WebElement allOps : options) {
String text = allOps.getText();
System.out.println(text);
}
}
public static void toGetAllSelectedOptions(WebElement e) {
s1=new Select(e);
List<WebElement> allSelectsOps = s1.getAllSelectedOptions();
for (WebElement allSelects : allSelectsOps) {
System.out.println(allSelects.getText());
}
}
public static void toGetFirstSelectedOption(WebElement e) {
s1=new Select(e);
WebElement fso = s1.getFirstSelectedOption();
System.out.println(fso.getText());
}
public static void toDeSelectAll(WebElement e) {
s1=new Select(e);
s1.deselectAll();
}

public static void toIterateWebTable(WebElement e) {
List<WebElement> allRows = e.findElements(By.tagName("tr"));
for (int i = 0; i < allRows.size(); i++) {
WebElement rows = allRows.get(i);
List<WebElement> allData = rows.findElements(By.tagName("td"));
for (int j = 0; j < allData.size(); j++) {
String text = allData.get(j).getText();
System.out.println(text);
}
}
}

public static void jsSendKeys(WebElement e, String str1) {
js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].setAttribute('value',str1)", e);
}

public static void jsClick(WebElement e) {
js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].click", e);
}

public static void jsPrintInConsole(WebElement e) {
js=(JavascriptExecutor) driver;
System.out.println(js.executeScript("return arguments[0].getAttribute('value')", e));
}

public static String toExcel(String sheetname,int rowno,int cellno) throws IOException {
	File f = new File("C:\\Users\\eclipse-workspace3\\Test1ng\\Excel\\Hotel.xlsx");
	FileInputStream input=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(input);
	s=w.getSheet(sheetname);
	r=s.getRow(rowno);
	c=r.getCell(cellno);
	return v1;
	}

public static String toIteration(String sheetname,int rowno,int cellno) throws IOException {
	File f = new File("C:\\Maven_Java\\testNextGen\\ExcelData\\AdactinHotelData.xlsx");
	FileInputStream input=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(input);
	s=w.getSheet(sheetname);
	r=s.getRow(rowno);
	c=r.getCell(cellno);
	int noofrow = s.getPhysicalNumberOfRows();
	System.out.println("No.of row="+noofrow);
	int noofcell = r.getPhysicalNumberOfCells();
	System.out.println("No.of cell="+noofcell);
	for (int i = 0; i < noofrow; i++) {
		 r = s.getRow(i);
		for (int j = 0; j < noofcell; j++) {
			c = r.getCell(j);
				int cellType = c.getCellType();
			
			if (cellType==1) {
				v1=c.getStringCellValue();
				
			}
			else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyy");
					v1=sim.format(d);
						
			} else {
				double d1=c.getNumericCellValue();
				long l=(long)d1;
				v1=String.valueOf(l);
			}

		}
		
	}
return v1;
}
public static void toUpdate() throws IOException {
	File f=new File("C:\\Users\\eclipse-workspace3\\Test1ng\\Excel\\Hotel.xlsx");
	FileInputStream input=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(input);
	Sheet s = w.getSheet("H1");
	Row r = s.getRow(1);
	Cell c = r.getCell(2);
	String s1 = c.getStringCellValue();
	if(s1.contains("b123")) {
		c.setCellValue("c123");
	}
	FileOutputStream output= new FileOutputStream(f);
	w.write(output);
}

public static void toClear(WebElement element) {
	element.clear();

}

public static void toTable() {
	WebElement table = driver.findElement(By.xpath("//input[@class=\"reg_button\"][3]"));
	
	List<WebElement> row = table.findElements(By.tagName("tr"));
	for(int i=0;i<row.size();i++) {
		WebElement r = row.get(i);
	
	List<WebElement> cell = r.findElements(By.tagName("td"));
	for(int j=0;j<cell.size();j++) {
		String text = cell.get(j).getText();
		System.out.println(text);	
	}
	
	}
}
}	
