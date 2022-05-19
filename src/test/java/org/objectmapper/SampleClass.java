package org.objectmapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleClass {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\src\\test\\resources\\ObjectMapper\\jason2.json");
		
		ObjectMapper mapper = new ObjectMapper();
		Class r = mapper.readValue(file, Class.class);
		
		int page = r.getPage();
		System.out.println(page);
		int per_page = r.getPer_page();
		System.out.println(per_page);
		int total = r.getTotal();
		System.out.println(total);
		int total_pages = r.getTotal_pages();
		System.out.println(total_pages);
		ArrayList<Data> data = r.getData();
		for (Data d : data) {
			System.out.println(d.getId());
			System.out.println(d.getEmail());
			System.out.println(d.getFirst_name());
			System.out.println(d.getLast_name());
			System.out.println(d.getAvatar());
		}
	
		Support support = r.getSupport();	
		System.out.println(support.getText());
		System.out.println(support.getUrl());
	}

}
