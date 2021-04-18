package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	public static JavascriptExecutor js;
	public static Alert alert;
	public static Scanner scan;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Poorni Shurthi\\Documents\\JavaSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void pageUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void fillTextbox(String attribute, String text, String value) {
		fillTextbox(attribute, text, value);

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	public static void sleep(int number) throws InterruptedException {
		Thread.sleep(number);

	}

	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void printText(WebElement element) {
		element.getText();

	}

	public static void printAttribute(WebElement element, String value) {
		element.getAttribute(value);

	}

	public static void launchActions() {
		a = new Actions(driver);
	}

	public static void goToWebElement(WebElement element) {
		a.moveToElement(element).perform();
	}

	public static void clickDouble(WebElement element) {

		a.doubleClick(element).perform();
	}

	public static void rightClick(WebElement element) {

		a.contextClick(element).perform();

	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		a.dragAndDrop(src, des);

	}

	public static void javaScript() {
		js = (JavascriptExecutor) driver;

	}

	public static void scrollDown(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void scrollUP(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void jsClick(WebElement element) {
		js.executeScript("arguments[0].click", element);

	}

	public static void jsSetAttribute(String valuetext, WebElement element) {
		js.executeScript("arguments[0].setAttribute('value',valuetext)", element);

	}

	public static void jsgetAttribute(WebElement element) {
		Object getrefname = js.executeScript("return arguments[0].getAttribute('value')", element);
		String s = (String) getrefname;
		System.out.println(s);
	}

	public static void launchAlert() {
		alert = driver.switchTo().alert();

	}

	public static void alertAccept() {
		alert.accept();

	}

	public static void cancelAlert() {
		alert.dismiss();

	}

	public static void alertFillTextbox(String value) {
		alert.sendKeys(value);

	}

	public static void alertPrintText() {
		alert.getText();

	}

	public static void launchSelect(WebElement element) {
		s = new Select(element);

	}

	public static void indexSelect() {
		scan = new Scanner(System.in);
		System.out.println("enter index value from dropdown table :");
		int i = scan.nextInt();
		s.selectByIndex(i);
	}

	public static void valueSelect() {
		scan = new Scanner(System.in);
		System.out.println("enter value from dropdown table :");
		String valuetext = scan.nextLine();
		s.selectByValue(valuetext);

	}

	public static void visibleTextSelect() {
		scan = new Scanner(System.in);
		System.out.println("enter visible text :");
		String textvisible = scan.nextLine();
		s.selectByVisibleText(textvisible);

	}

	public static void indexDeSelect() {
		scan = new Scanner(System.in);
		System.out.println("enter index value from dropdown table:");
		int i = scan.nextInt();
		s.deselectByIndex(i);

	}

	public static void valueDeSelect() {
		scan = new Scanner(System.in);
		System.out.println("enter value from dropdown table :");
		String valuetext = scan.nextLine();
		s.deselectByValue(valuetext);

	}

	public static void visibleTextDeSelect() {
		scan = new Scanner(System.in);
		System.out.println("enter visible text :");
		String textvisible = scan.nextLine();
		s.deselectByVisibleText(textvisible);

	}

	public static void dropdownValues(WebElement Element, int number) {
		s = new Select(Element);
		s.selectByIndex(number);

	}

	public static void dropdownValues(WebElement Element, String value) {
		s = new Select(Element);
		s.selectByValue(value);

	}

	public static void allDeselect() {
		s.deselectAll();

	}

	public static void selectMultiple() {
		boolean result = s.isMultiple();
		System.out.println("select multiple options: " + result);

	}

	public static void firstSelected() {
		WebElement option = s.getFirstSelectedOption();
		System.out.println("first selected option is " + option);

	}

	public static void getAllSelected() {
		List<WebElement> l = s.getAllSelectedOptions();
		System.out.println("All Selected Options are " + l);

	}

	public static void allOptions() {
		List<WebElement> l = s.getOptions();
		System.out.println("All Options are :" + l);

	}

	public static void frameId(String Id) {
		driver.switchTo().frame(Id);

	}

	public static void frameName(String name) {
		driver.switchTo().frame(name);

	}

	public static void frameRef(String Refname) {
		driver.switchTo().frame(Refname);

	}

	public static void frameIndex(int Index) {
		driver.switchTo().frame(Index);

	}

	public static void frameParent() {
		driver.switchTo().parentFrame();

	}

	public static void frameMainWindow() {
		driver.switchTo().defaultContent();

	}

	public static void fillTextbox(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void pauseProgram() throws InterruptedException {
		Thread.sleep(5000);

	}

	public static void CcValidation(String C) {
		if (C.length() < 16) {
			System.out.println("Enter a Valid 16 digit CC number");
			driver.quit();
		}

	}

	public static void TakeScreenShot(String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Poorni Shurthi\\Documents\\ProjectTestng\\Poorni");
		FileUtils.copyFile(src, des);

	}

	public static String readfromexcel(int rowno, int cellno) throws IOException {
		File f = new File(
				"C:\\Users\\Poorni Shurthi\\Documents\\ProjectTestng\\src\\test\\java\\org\\hotel\\Adactin.xlsx");
		FileInputStream fin = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fin);
		XSSFSheet sh = book.getSheet("poorni");
		XSSFRow r = sh.getRow(rowno);
		XSSFCell c = r.getCell(cellno);
		int type = c.getCellType();
		String name = "";
		if (type == 1) {
			name = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {

			Date d = c.getDateCellValue();
			SimpleDateFormat form = new SimpleDateFormat("dd-mm-yy");
			name = form.format(d);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			name = String.valueOf(l);
		}
		return name;
	}

	public static void Writeinexcel(int rowno, int cellno, String name, WebElement element) throws IOException {
		File f = new File("C:\\Users\\Poorni Shurthi\\Documents\\AdactinPagecucumber\\Excel\\" + name + ".xlsx");

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sh = book.createSheet("poorni");
		XSSFRow r = sh.createRow(rowno);
		XSSFCell c = r.createCell(cellno);
		js = (JavascriptExecutor) driver;
		String s = element.getAttribute("value");
		c.setCellValue(s);
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);

		System.out.println("updated in Excel");

	}

	public static Map<String, String> excelread(String rowValue) throws IOException {
		String txtData = "", txtHeading = "";
		Map<String, String> map = new LinkedHashMap<String, String>();
		File f = new File("C:\\Users\\Poorni Shurthi\\Documents\\AdactinPagecucumber\\Excel\\Adactin.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Hotel");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			Cell c = r.getCell(1);
			String data1 = c.getStringCellValue();
			if (data1.equals(rowValue)) {
				Row headerRow = s.getRow(0);
				Row requiredRow = s.getRow(i);
				for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
					Cell heading = headerRow.getCell(j);
					Cell c1 = requiredRow.getCell(j);
					txtHeading = heading.getStringCellValue();
					int type = c1.getCellType();
					if (type == 1) {
						txtData = c1.getStringCellValue();

					} else if (DateUtil.isCellDateFormatted(c1)) {

						Date d = c1.getDateCellValue();
						SimpleDateFormat form = new SimpleDateFormat("dd-mm-yy");
						txtData = form.format(d);
					} else {
						double d = c1.getNumericCellValue();
						long l = (long) d;
						txtData = String.valueOf(l);
					}
					map.put(txtHeading, txtData);
				}

			}

		

	
	}
		return map;


}}