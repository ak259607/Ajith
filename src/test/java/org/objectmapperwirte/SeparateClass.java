package org.objectmapperwirte;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SeparateClass {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
	
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Jason folder\\a1.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		ArrayList<PojoSample1> t = new ArrayList<PojoSample1>();
		
		PojoSample1 s1 = new PojoSample1("Ajith", "Java", "chennai");
		PojoSample1 s2 = new PojoSample1("Balaji", "Phyton", "madurai");
		PojoSample1 s3 = new PojoSample1("Priya", "API", "Trichy");
	
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		ArrayList<PojoSample2> v = new ArrayList<PojoSample2>();
		
		PojoSample2 d1 = new PojoSample2("tc01", "AKIL");
		PojoSample2 d2 = new PojoSample2("Tc02", "ABILASH");
		
		v.add(d1);
		v.add(d2);
		
		PojoMain m = new PojoMain("AK", "AK@gmail.com", 7010790165l, t, v);
		mapper.writeValue(file, m);
	
	
	}
	
	
	
	

}
