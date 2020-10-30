package com.mavenir.teacher.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Teacher {
	@Id
	String name;
	int[] students;


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

	public Teacher(String name, int[] students) {
		super();
		this.name = name;
		this.students = students;
	}

	public Teacher() {
		super();
	}

}