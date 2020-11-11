package com.mavenir.App.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class Student {

	@Id
	Integer rollno;
	
	String name;
	
	Integer[] marks;
	
	String teacher;
	
	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer[] getMarks() {
		return marks;
	}

	public void setMarks(Integer[] marks) {
		this.marks = marks;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public Student() {
		super();
	}
	
	public Student(Integer rollno, String name, Integer[] marks, String teacher) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.teacher = teacher;
	}
	
}
