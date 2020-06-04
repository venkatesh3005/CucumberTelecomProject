package org.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.stepdefinition.Hooks;

public class Utility {
	
	public static void launchApp(String s) {

		Hooks.driver.get(s);
	}
	
	public static void fill(WebElement w,String s) {
		w.sendKeys(s);
	}
	
	public static void klik(WebElement w) {
		w.click();
	}
	
	public static void printTitle() {
		System.out.println(Hooks.driver.getTitle());
	}
	
	public static String url() {
	
		 String u = Hooks.driver.getCurrentUrl();
		return u;
		
	}
	
	public static void jClick(WebElement w) {
		
		JavascriptExecutor js=(JavascriptExecutor)Hooks.driver;
		js.executeScript("arguments[0].click()", w);
	}
	
	
	public static List<LinkedHashMap<String,String>> readDatas() throws Exception {
		
		List<LinkedHashMap<String,String>>listMap=new ArrayList<LinkedHashMap<String,String>>();
		File f=new File(System.getProperty("user.dir")+"//target//excel//Cucumber-guru-data.xlsx");
	
        FileInputStream stream=new FileInputStream(f);
        
        Workbook w=new XSSFWorkbook(stream);
        
        Sheet s = w.getSheet("Sheet1");
        Row headerRow = s.getRow(0);
        
        for(int i=1;i<s.getPhysicalNumberOfRows();i++) {
        	
        	Row eachRow = s.getRow(i);
        	//Map
        	LinkedHashMap <String,String> mp=new LinkedHashMap<String,String>();
        	
        	for(int j=0;j<headerRow.getPhysicalNumberOfCells();j++) {
        		
        		Cell eachCell = eachRow.getCell(j);
        		int type = eachCell.getCellType();
        		
        		if(type==1) {
     
        	mp.put(headerRow.getCell(j).getStringCellValue(),eachCell.getStringCellValue() );
        		}
        		else {
        			long l=(long)eachCell.getNumericCellValue();
        			
        			mp.put(headerRow.getCell(j).getStringCellValue(), String.valueOf(l));
        		}
        	}
        	
        	listMap.add(mp);
        	
        }
		return listMap;
        
	
		
	
	}
	

}
