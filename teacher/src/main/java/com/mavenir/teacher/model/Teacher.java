package com.mavenir.teacher.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;




@Document
public class Teacher{
	
	@Id
	String name;
	
	String password;
	
	int[] students;
	
	String auth;


	
	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getStudents() {
		return students;
	}

	public void setStudents(int[] students) {
		this.students = students;
	}

	
	
	
	public Teacher(String name, String password, int[] students,String auth) {
		this.name = name;
		this.password = password;
		this.students = students;
		this.auth = auth;
	}

	public Teacher() {
		super();
	}

}
