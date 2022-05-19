package org.jason2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JasonTest {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader reader = new FileReader("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Jason folder\\Jsonfile.json");
		
		JSONParser parser = new JSONParser();
		
		Object parse = parser.parse(reader);
		
		JSONObject o = (JSONObject)parse;
		
		Object page = o.get("page");
		Object pageper = o.get("per_page");
		System.out.println(page);
		System.out.println(pageper);
		
		Object obj = o.get("data");
		
		JSONArray  a = (JSONArray)obj;
		
		
		for (int i = 0; i < a.size() ; i++) {
			Object l = a.get(i);
//			System.out.println(l);
			
			JSONObject h = (JSONObject)l;
			Object object = h.get("color");
			System.out.println(object);
			Object name = h.get("name");
			System.out.println(name);
			
			
		}
	
	}

	
}
