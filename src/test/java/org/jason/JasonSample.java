package org.jason;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JasonSample {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(
				"C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Jason folder\\Jasonfile.jason");
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(fileReader);
		JSONObject o = (JSONObject) parse;
		Object data = o.get("data");
		System.out.println(data);
		JSONObject i = (JSONObject) data;
		Object k = i.get("id");
		System.out.println(k);
		Object v = i.get("email");
		System.out.println(v);
		Object n = i.get("first_name");
		System.out.println(n);
		Object l = i.get("last_name");
		System.out.println(l);
		Object p = i.get("avatar");
		System.out.println(p);

		JSONObject s = (JSONObject) parse;
		Object support = s.get("support");
		System.out.println(support);
		JSONObject g = (JSONObject)support;
		Object q = g.get("url");
		System.out.println(q);
		Object r = g.get("text");
		System.out.println(r);
	}

}
