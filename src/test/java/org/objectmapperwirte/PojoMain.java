package org.objectmapperwirte;

import java.util.ArrayList;

public class PojoMain {

	private String name;
	private String email;
	private long phoneno;
	private ArrayList<PojoSample1> sample;
	private ArrayList<PojoSample2> sample2;
	public PojoMain(String name, String email, long phoneno, ArrayList<PojoSample1> sample,
			ArrayList<PojoSample2> sample2) {
		super();
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.sample = sample;
		this.sample2 = sample2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public ArrayList<PojoSample1> getSample() {
		return sample;
	}
	public void setSample(ArrayList<PojoSample1> sample) {
		this.sample = sample;
	}
	public ArrayList<PojoSample2> getSample2() {
		return sample2;
	}
	public void setSample2(ArrayList<PojoSample2> sample2) {
		this.sample2 = sample2;
	}
	
		
	
	
	
}