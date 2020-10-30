package com.mavenir.App.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Student {

	@Id
	private Integer rollno;
	private String name;
	private Integer[] marks;
	private String teacher;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rollno == null) ? 0 : rollno.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollno == null) {
			if (other.rollno != null)
				return false;
		} else if (!rollno.equals(other.rollno))
			return false;
		return true;
	}
	
}
