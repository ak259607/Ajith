package org.apijsonpath;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apibase.BaseClass;
import org.apibase.Endpoint;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ApiJsonPath extends BaseClass{

	@Test
	public void path() throws IOException {
		addHeader("content-Type", "application/json");
		basicauthi(getproperty("email"), getproperty("password"));
		Response response = requesttype("POST", Endpoint.LOGIN);
		ResponseBody getbody = getbody(response);
		String jsonpath = jsonpath("message", response);
		assertEquals(jsonpath, "Login Successfully", "Verify Login Successfully");
	
	
	
	}
		
}
