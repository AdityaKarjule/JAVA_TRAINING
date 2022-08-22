package com.ds;

public class User {
	private String name;
	private String email;
	private String city;
	private String mobno;
	
	public User() {
		super();
	}
	public User(String name, String email,String city, String mobno ) {
		super();
		this.name = name;
		this.email = email;
		this.mobno = mobno;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	
	
}
