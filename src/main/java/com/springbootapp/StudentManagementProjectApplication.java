package com.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import com.springbootapp.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootapp.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementProjectApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student();
//		student.setStudentName("Avadhut Patil");
//		student.setStudentEmail("avadhut@gmail.com");
//		this.studentRepository.save(student);
	}

}
