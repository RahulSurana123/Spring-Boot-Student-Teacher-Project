package com.mavenir.App.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.mavenir.App.model.Student;

@Repository
public interface StudentRepo extends CouchbaseRepository<Student, Integer>{
	
}
