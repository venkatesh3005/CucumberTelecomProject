package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustomer;

	public WebElement getAddCustomer() {
		return addCustomer;
	}

	
}
