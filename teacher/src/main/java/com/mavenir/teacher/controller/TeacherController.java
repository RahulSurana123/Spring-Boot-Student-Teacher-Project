package com.mavenir.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mavenir.teacher.Repo.TeacherRepo;
import com.mavenir.teacher.model.Teacher;

@RestController
@RequestMapping("/home")
public class TeacherController {

	@Autowired
	private TeacherRepo tr;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String saveTeacher(@RequestBody Teacher st) {
		tr.save(st);
		System.out.println("Saved a teacher");
		return "Saved Successfully";
	}

	@RequestMapping("/teacher/{t}")
	@ResponseStatus(HttpStatus.OK)
	public Teacher getTeacher(@PathVariable String t){
		return tr.findById(t).orElse(new Teacher());
	}
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Teacher> getTeachers() {
		return tr.findAll();
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public String deleteTeachers(@RequestBody String name) {
		tr.deleteById(name);
		System.out.println("Deleted a Teacher");
		return "Deleted Successfully";
	}

}
