package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.repository.HomePage;
import org.repository.RegistrationPage;
import org.resources.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Utility  {
	
	RegistrationPage registrationPage;
	@Given("user is in home page and selects add customer option")
	public void user_is_in_home_page_and_selects_add_customer_option() throws InterruptedException {
	  
		launchApp("http://demo.guru99.com/telecom/");
		
		HomePage h=new HomePage();
		jClick(h.getAddCustomer());
		Thread.sleep(5000);
		
	}

	@When("user enters cutomer details with firstname and lastname")
	public void user_enters_cutomer_details_with_firstname_and_lastname() {
	     registrationPage=new RegistrationPage();
	     
	     jClick(registrationPage.getDone());
	    
	    fill(registrationPage.getFirstName(),"Arun");
	    
	    fill(registrationPage.getLastName(),"kumar");
	    
	    fill(registrationPage.getEmail_TxtBox(),"greens@gmai.com");
	    
	    fill(registrationPage.getAddress_TxtBox(),"Chennai");
	    
	    fill(registrationPage.getMobile_TxtBox(),"8412365984");
	    
		
	}

	@When("user clicks submit button")
	public void user_clicks_submit_button() {
		 jClick(registrationPage.getSubmit_btn());
		
	}

	@Then("customer id should be generated")
	public void customer_id_should_be_generated() {
		 String pageUrl = url();
		 Assert.assertTrue(pageUrl.contains("uid"));
	}

}
