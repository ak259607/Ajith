package org.objectmapperwirte;

public class PojoSample1 {
	
	private String Firstname;
	private String course;
	private String district;
	public PojoSample1(String firstname, String course, String district) {
		super();
		Firstname = firstname;
		this.course = course;
		this.district = district;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	

}
