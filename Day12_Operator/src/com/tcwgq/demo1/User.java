package com.tcwgq.demo1;

public class User {
	private String username;
	private String passwrod;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	public User(String username, String passwrod) {
		super();
		this.username = username;
		this.passwrod = passwrod;
	}
	
}
