package com.mavenir.school.model;

public class Teacher {
	public String name;
	public int[] students;


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
