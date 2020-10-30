package com.mavenir.teacher.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class TeacherConfig extends AbstractCouchbaseConfiguration {

	@Override
	public String getConnectionString() {

		return "couchbase://127.0.0.1";
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return "Rahul";
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "passord";
	}

	@Override
	public String getBucketName() {
		// TODO Auto-generated method stub
		return "Teachers";
	}

}