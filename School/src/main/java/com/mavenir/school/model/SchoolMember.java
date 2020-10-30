package com.mavenir.school.model;

import org.springframework.data.couchbase.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class SchoolMember {
	
	String name;
	Student[] students;
	
	public SchoolMember(String name, Student[] students) {
		super();
		this.name = name;
		this.students = students;
	}

	public SchoolMember() {
		super();
	}
	
}
