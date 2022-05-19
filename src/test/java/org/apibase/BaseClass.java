package org.apibase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	RequestSpecification req;
	Response res;
	public void addHeader(String key, String value) {
		 
		req  = RestAssured.given().log().all().header(key,value);

	}
	
	public String jsonpath(String key, Response response) {
		JsonPath path = getbody(response).jsonPath();
		Object object = path.get(key);
		String s = (String) object;
		return s;
	}
	
	
	
	public void basicauthi(String username, String password) {
		
		req = req.auth().preemptive().basic(username, password);
		}
	
	public Response requesttype(String Type, String endpoint) {
		switch (Type) {
		case "GET":
			res = req.log().all().get(endpoint);
			break;

		case "POST":
			res = req.log().all().post(endpoint);
			break;

		case "PUT":
			res = req.log().all().put(endpoint);
			break;

		case "DELETE":
			res = req.log().all().delete(endpoint);
			break;

			
			
			
		default:
			break;
		}
		
		return res;
	}
	
	public ResponseBody getbody(Response response) {
		ResponseBody body = res.getBody();
		return body;
	}
	
	public int getstatuscode(Response res) {
		int statusCode = res.getStatusCode();
		return statusCode;
	}
	
	public void payload(String body) {
		req = req.body(body);

	}
	public Object payload1(Object body) {
		req = req.body(body);
		return body;
	}
	public Integer jasonpathnum(String key, Response response) {
		JsonPath jsonPath = getbody(response).jsonPath();
		Object object = jsonPath.get(key);
		Integer i = (Integer) object;
		return i;
	
	}
	public void addheaders(Headers headers) {
		req = RestAssured.given().headers(headers);
	}
	public String getbodyaspretty(Response res) {
	
		String asPrettyString = res.asPrettyString();
		return asPrettyString;
	}
	
	public String getproperty(String key) throws IOException {
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Propertyfolder\\filename.properties");
		Properties properties = new Properties();
		properties.load(stream);
		
		Object object = properties.get(key);
		System.out.println(object);
		String s = (String)object;
		return s;
		
	}
	
}
