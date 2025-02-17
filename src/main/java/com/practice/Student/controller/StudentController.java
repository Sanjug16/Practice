package com.practice.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Student.model.Student;
import com.practice.Student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentService ser;

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		return ser.addStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return ser.getAllStudents();
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable long id)
	{
		 ser.deleteStudent(id);
	}
	
	@PutMapping
	public Student updateStudent(@RequestBody Student student)
	{
		return ser.updateStudent(student);
	}
}
