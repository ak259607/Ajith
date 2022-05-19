package org.hooks;

import org.base2.Base2;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends Base2 {
	
	@Before
	public void beforelogin() {
		browserLaunch("https://www.facebook.com/");

	}
	
	@After
	public void afterexecution() {
		System.out.println("successfully login");

	}
	
	

}
