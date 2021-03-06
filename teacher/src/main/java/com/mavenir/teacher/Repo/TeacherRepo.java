package com.mavenir.teacher.Repo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.mavenir.teacher.model.Teacher;

@Repository
public interface TeacherRepo extends CouchbaseRepository<Teacher, String> {
	
}
