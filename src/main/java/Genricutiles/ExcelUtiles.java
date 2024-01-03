package Genricutiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class ExcelUtiles {
	
	public String readDatafromexcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(" ");
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet Sh = wb.getSheet(sheetname);
		String value = Sh.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	
	public void readmultipledata(String Sheetname,WebDriver driver) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(" ");
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(Sheetname);
		int count = sh.getLastRowNum();
		
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i <=count; i++) 
			
		
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(0).getCell(0).getStringCellValue();
			map.put(key, value);
		}
		for (Entry<String, String> n :map.entrySet()) {
		 driver.findElement(By.name(n.getKey())).sendKeys(n.getValue());;
			
		}
			
		
	}
	
	

}
