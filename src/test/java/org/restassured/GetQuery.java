package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetQuery {

	public static void main(String[] args) {
		
		RequestSpecification req = RestAssured.given();
		
		RequestSpecification header = req.header("Content-Type","application/json");
		
		RequestSpecification param = req.queryParam("obj", "3");
		
		Response response = param.log().all().get("https://reqres.in/api/users");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		ResponseBody body = response.getBody();
		System.out.println(body);
		
		String asString = body.asString();
		System.out.println(asString);
		
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	
	
	}
	
	
	
	
}
