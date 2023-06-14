package com.springbootapp.service;

import java.util.List;

import com.springbootapp.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	
	public Student addNewStudent(Student student);
	
	public Student getStudentById(long studentId);
	
	public Student editStudent(Student student);
	
	public void deleteStudent(long studentId); 
}
