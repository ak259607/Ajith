package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Delete {
	public static void main(String[] args) {
		RequestSpecification req = RestAssured.given();

		RequestSpecification header = req.header("Content-Type", "application/json");

		Response delete = req.log().all().delete("https://reqres.in/api/users/2");

		int statusCode = delete.getStatusCode();
		System.out.println(statusCode);

		ResponseBody body2 = delete.getBody();
		System.out.println(body2);

		String asString = body2.asString();
		System.out.println(asString);

		String asPrettyString = body2.asPrettyString();
		System.out.println(asPrettyString);
	}

}
