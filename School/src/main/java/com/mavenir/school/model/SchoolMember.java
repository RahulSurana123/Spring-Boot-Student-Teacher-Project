package com.mavenir.school.model;

import java.util.List;


public class SchoolMember {
	
	String name;
	List<Student> students;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public SchoolMember(String name, List<Student> s) {
		super();
		this.name = name;
		this.students = s;
	}

	public SchoolMember() {
		super();
	}
	
}
