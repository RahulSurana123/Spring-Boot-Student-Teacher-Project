package com.mavenir.school.Repo;

import java.util.Optional;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.mavenir.school.model.User;

@Repository
public interface UserRepo extends CouchbaseRepository<User, Integer>{

	Optional<User> findByUserName(String userName);
	
}
