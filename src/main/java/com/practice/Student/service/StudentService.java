package com.practice.Student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Student.model.Student;
import com.practice.Student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public Student addStudent(Student student)
	{
		return studentRepo.save(student);
	}
	
	public List<Student> getAllStudents()
	{
		return studentRepo.findAll();
	}
	public void deleteStudent(long id)
	{
		studentRepo.deleteById(id);
	}
	public Student updateStudent(Student student)
	{
		return studentRepo.save(student);
	}
}
