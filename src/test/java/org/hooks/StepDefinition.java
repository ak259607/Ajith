package org.hooks;


import org.base2.Base2;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base2{
	
	
	
	@When("user should enter the username and password")
	public void user_should_enter_the_username_and_password() {
	findelementId("email").sendKeys("ajith");
	findelementId("pass").sendKeys("Ak@1234");
	}
	@When("user should click the login button")
	public void user_should_click_the_login_button() {
	    name("login").click();
	}
	@Then("user should verify te success message")
	public void user_should_verify_te_success_message() {
	    System.out.println("successful login");
	}






}
