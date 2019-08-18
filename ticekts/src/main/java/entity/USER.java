package com.matchBook.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class USER {
	
	@Id
	private String mail;
	private String name;
	private String mobile;
	private String password;
	
	public USER() {
		
	}

	public USER(String name, String mobile, String mail, String password) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.mail = mail;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
