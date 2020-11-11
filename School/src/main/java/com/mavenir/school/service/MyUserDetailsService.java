package com.mavenir.school.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mavenir.school.Repo.UserRepo;
import com.mavenir.school.model.MyUserDetails;
import com.mavenir.school.model.User;


@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepo sr;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> uDetails = sr.findByUserName(username); 
		
		uDetails.orElseThrow(()-> new UsernameNotFoundException("Teacher not found : " + username));
		return uDetails.map(MyUserDetails::new).get();
//		return new MyUserDetails("foo","foo", Arrays.asList(new SimpleGrantedAuthority("user")));
	}

}
