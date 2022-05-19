package org.apibase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Sample extends BaseClass{

	
	Response response;
	String logtoken;
	int address_id;

	@Test(priority=1)
	public void login() throws IOException {
		addHeader("Content-Type", "application/json");
		basicauthi(getproperty("email"), getproperty("password"));
		response = requesttype("POST", Endpoint.LOGIN);
		
		Loginoutput as = response.as(Loginoutput.class);
		
		int i = getstatuscode(response);
		System.out.println(i);

//		String string = getbodyaspretty(response);
//		System.out.println(string);
//		String jsonpath = jsonpath("message", response);
//		Assert.assertEquals(jsonpath, "Login successfully", "verify login successfully");
		Assert.assertEquals(as.getMessage(), "Login successfully", "verify login successfully");
//		logtoken = jsonpath("data.logtoken", response);
		logtoken = as.getData().getLogtoken();
		System.out.println(logtoken);
	}

//	@Test(priority=2)
//	public void AddAddress() {
//		List<Header> header = new ArrayList<Header>();
//
//		Header h1 = new Header("content-Type", "application/json");
//		Header h2 = new Header("Authorization", "Bearer " + logtoken);
//
//		header.add(h1);
//		header.add(h2);
//		Headers headers = new Headers(header);
//		addheaders(headers);
//
//		payload("{\r\n" + "  \"first_name\": \"Ajith\",\r\n" + "  \"last_name\": \"Kumar\",\r\n"
//				+ "  \"mobile\": \"1234567898\",\r\n" + "  \"apartment\": \"apartment\",\r\n" + "  \"state\": 33,\r\n"
//				+ "  \"city\": 3378,\r\n" + "  \"country\": 101,\r\n" + "  \"zipcode\": \"202020\",\r\n"
//				+ "  \"address\": \"64/63 partap nagar\",\r\n" + "  \"address_type\": \"home\"\r\n" + "}");
//
//		Response requesttype = requesttype("POST", Endpoint.ADDADDRESS);
//
//		System.out.println(getstatuscode(requesttype));
//		System.out.println(getbodyaspretty(requesttype));
//
//		String jsonpath = jsonpath("message", requesttype);
//		Assert.assertEquals(jsonpath, "Address added successfully", "verify address added successfully");
//		address_id = jasonpathnum("address_id", requesttype);
//	}
//
//	@Test(priority=3)
//	public void UpdateAddress() {
//		List<Header> header = new ArrayList<Header>();
//
//		Header h1 = new Header("content-Type", "application/json");
//		Header h2 = new Header("Authorization", "Bearer " + logtoken);
//
//		header.add(h1);
//		header.add(h2);
//		Headers headers = new Headers(header);
//		addheaders(headers);
//
//		payload("{\r\n" + 
//				"  \"address_id\": \""+address_id+"\",\r\n" + 
//				"  \"first_name\": \"Raj\",\r\n" + 
//				"  \"last_name\": \"Khundra\",\r\n" + 
//				"  \"mobile\": \"1234567898\",\r\n" + 
//				"  \"apartment\": \"apartment\",\r\n" + 
//				"  \"state\": 33,\r\n" + 
//				"  \"city\": 3378,\r\n" + 
//				"  \"country\": 101,\r\n" + 
//				"  \"zipcode\": \"202020\",\r\n" + 
//				"  \"address\": \"64/63 partap nagar\",\r\n" + 
//				"  \"address_type\": \"home\"\r\n" + 
//				"}");
//
//		Response requesttype = requesttype("PUT", Endpoint.UPDATEADDRESS);
//
//		System.out.println(getstatuscode(requesttype));
//		System.out.println(getbodyaspretty(requesttype));
//
//		String jsonpath = jsonpath("message", requesttype);
//		Assert.assertEquals(jsonpath, "Address updated successfully", "verify address updated successful");
//
//	}
//	@Test(priority=4)
//	public void getaddress() {
//		List<Header> header = new ArrayList<Header>();
//
//		Header h1 = new Header("content-Type", "application/json");
//		Header h2 = new Header("Authorization", "Bearer " + logtoken);
//
//		header.add(h1);
//		header.add(h2);
//		Headers headers = new Headers(header);
//		addheaders(headers);
//
//
//	Response requesttype = requesttype("GET", Endpoint.GETADDRESS);
//	System.out.println(getstatuscode(requesttype));
//	System.out.println(getbodyaspretty(requesttype));
//	
//	String jsonpath = jsonpath("message", requesttype);
//	Assert.assertEquals(jsonpath, "OK","verify OK");
//
//	
//	
//	}
//	@Test(priority=5)
//public void DeleteAddress() {
//		List<Header> header = new ArrayList<Header>();
//
//		Header h1 = new Header("content-Type", "application/json");
//		Header h2 = new Header("Authorization", "Bearer " + logtoken);
//
//		header.add(h1);
//		header.add(h2);
//		Headers headers = new Headers(header);
//		addheaders(headers);
//		
//		
//		payload("{\r\n" + 
//				"  \"address_id\": \""+address_id+"\"\r\n" + 
//				"}");
//		
//		Response requesttype = requesttype("DELETE", Endpoint.DELETEADDRESS);
//		System.out.println(getstatuscode(requesttype));
//		System.out.println(getbodyaspretty(requesttype));
//
//		String jsonpath = jsonpath("message", requesttype);
//		Assert.assertEquals(jsonpath, "Address deleted successfully", "verify address deleted successfully");
//		
//		
//	}
//	
//	
	
}

	

