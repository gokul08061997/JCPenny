package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static WebDriver driver;
	public static void start() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GovindRaj\\eclipse-workspace-testng\\JCPennyTestng\\driver\\chromedriver.exe");
		driver= new ChromeDriver();

	}
	
	public static void time() {
		Date d = new Date();
		System.out.println(d);
	}
	public static String data(int rono,int cellno) throws IOException {
		String value=null;
		File f = new File("C:\\Users\\GovindRaj\\eclipse-workspace-testng\\JCPennyTestng\\excel\\testng.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("sheet1");
		Row l = sheet.getRow(rono);
		Cell c = l.getCell(cellno);
		 value = c.getStringCellValue();
		 
		 return value;
	}
	
	public static void select(WebElement f) {
		
		Select s = new Select(f);
		s.selectByValue("small");
	}
	
	public static void select1(WebElement f1) {

		Select s = new Select(f1);
		s.selectByValue("CA");
	}

}
