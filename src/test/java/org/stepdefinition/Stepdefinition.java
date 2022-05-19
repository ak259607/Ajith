package org.stepdefinition;

import org.base2.Base2;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinition extends Base2 {
		
	
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
		browserLaunch("https://www.facebook.com/");
		    
	}
	@When("user should enter the {string} and {string}")
	public void user_should_enter_the_and(String username, String password) {
	 findelementId("email").sendKeys(username);
	findelementId("pass").sendKeys(password);
	
	}
	@When("user should click the login button")
	public void user_should_click_the_login_button() {
	name("login").click();    
	
	}
	@Then("user should verify te success message")
	public void user_should_verify_te_success_message() {
	    System.out.println("successfully entered");
	}


	
}
