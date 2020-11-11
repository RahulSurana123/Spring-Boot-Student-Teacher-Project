package com.mavenir.school.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mavenir.school.service.MyUserDetailsService;

@EnableWebSecurity
public class SchoolSecurity extends WebSecurityConfigurerAdapter{
	@Autowired
	private MyUserDetailsService myUserDetailService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(myUserDetailService);
		auth.inMemoryAuthentication()
		.withUser("rahul").password("passord").roles("TEACHER").and()
		.withUser("rah").password("passord").roles("STUDENT");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/school/schoolmember/**").hasAnyRole("TEACHER","STUDENT")
		.antMatchers("/school/**").hasRole("TEACHER")
		.antMatchers("/school").permitAll()
//		.anyRequest().authenticated()
//		.and().httpBasic();
		.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
		}
}
