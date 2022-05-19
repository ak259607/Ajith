package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Put {

	public static void main(String[] args) {
		RequestSpecification req = RestAssured.given();

		RequestSpecification header = req.header("Content-Type", "application/json");

		RequestSpecification body = req
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}");

		Response put = body.log().all().put("https://reqres.in/api/users");

		int statusCode = put.getStatusCode();
		System.out.println(statusCode);

		ResponseBody body2 = put.getBody();
		System.out.println(body2);

		String asString = body2.asString();
		System.out.println(asString);

		String asPrettyString = body2.asPrettyString();
		System.out.println(asPrettyString);
	}

}
