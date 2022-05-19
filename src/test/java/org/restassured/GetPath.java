package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetPath {
	
	public static void main(String[] args) {
		
		
		RequestSpecification req = RestAssured.given();
		
		RequestSpecification header = req.header("Content-Type","application/json");
		
		RequestSpecification pathParam = req.pathParam("page", "2");
		
		Response response = req.log().all().get("https://reqres.in/api/users/{page}");
	
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		 ResponseBody body = response.getBody();
		System.out.println(body);
		
		String string = body.asString();
		System.out.println(string);
		
		String string2 = body.asPrettyString();
		System.out.println(string2);
		
		
	}
	
	
	
	
	
	

}
