package org.testdef;

import org.base2.Base2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends Base2 {
	

	@Given("user is on facebook logintwo page")
	public void user_is_on_facebook_logintwo_page() {
		browserLaunch("https://www.facebook.com/");
	}
	@When("user should enter the usernametwo and password")
	public void user_should_enter_the_usernametwo_and_password() {
		 findelementId("email").sendKeys("ajith");
		    findelementId("pass").sendKeys("ajith@122");
	}
	@When("user should click the login buttontwo")
	public void user_should_click_the_login_buttontwo() {
		name("login").click();
	}
	
	@Given("user is on facebook loginthree page")
	public void user_is_on_facebook_loginthree_page() {
		browserLaunch("https://www.facebook.com/");
	}
	@When("user should enter the usernamethree and password")
	public void user_should_enter_the_usernamethree_and_password() {
		 findelementId("email").sendKeys("ajithak");
		    findelementId("pass").sendKeys("ajith@122");
	}
	@When("user should click the login buttonthree")
	public void user_should_click_the_login_buttonthree() {
		name("login").click();
	}
	
	@Given("user is on facebook loginfour page")
	public void user_is_on_facebook_loginfour_page() {
		browserLaunch("https://www.facebook.com/");
	}
	@When("user should enter the usernamefour and password")
	public void user_should_enter_the_usernamefour_and_password() {
		 findelementId("email").sendKeys("ajithAK");
		    findelementId("pass").sendKeys("ajith@122");
	}
	@When("user should click the login buttonfour")
	public void user_should_click_the_login_buttonfour() {
		name("login").click();
	}














}
