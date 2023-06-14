package com.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
