package com.mavenir.school.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;

import lombok.Data;
//import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;

@Document
@Data
public class User {
	
	@Id
	int id;
	
	String userName;
	
	String password;
	
	String auth;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String username) {
		this.userName = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAuth() {
		return auth;
	}
	
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	public User(int id, String username, String password, String auth) {
		super();
		this.id = id;
		this.userName = username;
		this.password = password;
		this.auth = auth;
	}
	
	public User() {
		super();
	}
	
}
