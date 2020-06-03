package org.resources;

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
	
	

}
