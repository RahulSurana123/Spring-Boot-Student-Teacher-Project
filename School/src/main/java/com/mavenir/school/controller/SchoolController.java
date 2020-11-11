package com.mavenir.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.mavenir.school.Repo.UserRepo;
import com.mavenir.school.model.MyUserDetails;
import com.mavenir.school.model.SchoolMember;
import com.mavenir.school.model.Student;
import com.mavenir.school.model.Teacher;
import com.mavenir.school.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/school")
public class SchoolController {

	@Autowired
	UserRepo ur;
	
	@Autowired
	WebClient.Builder b;
	
	@PostMapping
	public String addUser(@RequestBody User u) {
		ur.save(u);
		System.out.print("Saved successfully");
		return "User Saved Successfully";
	}
	
	@GetMapping
	public String Welcome() {
		return "<h2>Welcome SchoolMember</h2>";
	}
	
	
	@RequestMapping("/schoolmember/{t}")
	public User getUser(@PathVariable String t){
		
		return ur.findByUserName(t).orElse(new User());
	}
	
//	@RequestMapping("/schoolmember/{t}")
//	public String getUser(){
//		
//		return "User details accessable";
//	}
	
	@GetMapping("/{teacher}")
	public SchoolMember getSchoolMembers(@PathVariable String teacher){
	
		Teacher t = b.build().get().uri("http://Teacher/home/teacher/"+teacher)
				.retrieve().bodyToMono(Teacher.class).block();
		if(t.students !=null) {
		
		List<Student> s = Arrays.stream(t.students).boxed().collect(Collectors.toList()).stream()
				.map( x -> {
				
				Student a = b.build().get()
				.uri("http://Student/home/student/"+ x)
				.retrieve().bodyToMono(Student.class).block();
				
				return new Student(a.getRollno(),a.getName(),a.getMarks(),a.getTeacher());
				}).collect(Collectors.toList());
			
//		Student[] s = new Student[t.students.length];
//		
//		for(int i=0;i<s.length;i++) s[i] = b.build().get()
//				.uri("http://Student/home/student/"+ t.students[i])
//				.retrieve().bodyToMono(Student.class).block();
		
		
		
		return new SchoolMember(t.name,s);
		}
		return new SchoolMember(t.name,new ArrayList<Student>());
	}
	
//	@GetMapping("/{teacher}")
//	public String getSchoolMembers(){
//		return "Teacher Details Accessable";
//	}

}
