package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class RegistrationPage {
	
	public RegistrationPage() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
	
	@FindBy(xpath="//label[@for='done']")
	private WebElement done;
	
	@FindBy(id="fname")
	private WebElement firstName;
	
	@FindBy(id="lname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement email_TxtBox;
	
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement address_TxtBox;
	
	@FindBy(id="telephoneno")
	private WebElement mobile_TxtBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit_btn;

	public WebElement getDone() {
		return done;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail_TxtBox() {
		return email_TxtBox;
	}

	public WebElement getAddress_TxtBox() {
		return address_TxtBox;
	}

	public WebElement getMobile_TxtBox() {
		return mobile_TxtBox;
	}

	public WebElement getSubmit_btn() {
		return submit_btn;
	}
	
	
	

}
