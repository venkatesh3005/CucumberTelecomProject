package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\target\\chromedriver.exe");
		 driver =new ChromeDriver();
		 
	}

	
	@After
	public void afterScenario() {
		driver.quit();
	}
	
}
