package com.app.domain;

public class Patient {
	private String age;
	private String pName;
	private String bloodGroop;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String age, String pName, String bloodGroop) {
		super();
		this.age = age;
		this.pName = pName;
		this.bloodGroop = bloodGroop;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getBloodGroop() {
		return bloodGroop;
	}

	public void setBloodGroop(String bloodGroop) {
		this.bloodGroop = bloodGroop;
	}

	@Override
	public String toString() {
		return "Patient [age=" + age + ", pName=" + pName + ", bloodGroop=" + bloodGroop + "]";
	}

}
