package com.mavenir.school.Repo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.mavenir.school.model.SchoolMember;


public interface SchoolRepo  extends CouchbaseRepository<SchoolMember, Integer>{

}
