package com.springbootapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapp.model.Student;
import com.springbootapp.repository.StudentRepository;
import com.springbootapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student addNewStudent(Student student) {
		return this.studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long studentId) {
		return this.studentRepository.findById(studentId).get();
	}

	@Override
	public Student editStudent(Student student) {
		return this.studentRepository.save(student);
	}

	@Override
	public void deleteStudent(long studentId) {
		this.studentRepository.deleteById(studentId);
	}
}
