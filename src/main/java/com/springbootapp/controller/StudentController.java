package com.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.springbootapp.service.impl.StudentServiceImpl;
import com.springbootapp.model.*;
@Controller
public class StudentController {

	private StudentServiceImpl studentServiceImpl;

	public StudentServiceImpl getStudentServiceImpl() {
		return studentServiceImpl;
	}
	
	@Autowired
	public void setStudentServiceImpl(StudentServiceImpl studentServiceImpl) {
		this.studentServiceImpl = studentServiceImpl;
	}

	@GetMapping("/api/home")
	public String getHomePage() {
		return "index";
	}
	
	@GetMapping("/api/students")
	public String getStudentsPage(Model model) {
		model.addAttribute("students", this.studentServiceImpl.getAllStudent());
		return "students";
	}
	
	@GetMapping("/api/addNewStudent")
	public String getAddNewStudentPage(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add-new-student";
	}
	
	@PostMapping("/api/students")
	public String addNewStudent(@ModelAttribute("student") Student student) {
		this.studentServiceImpl.addNewStudent(student);
		return "redirect:/api/students"; 
	}
	
	@GetMapping("/api/updateStudent/{studentId}")
	public String getUpdateStudentPage(@PathVariable("studentId") long studentId, Model model) {
		model.addAttribute("student", this.studentServiceImpl.getStudentById(studentId));
		return "update-student";
	}
	
	@PostMapping("/api/students/{studentId}")
	public String updateStudent(@PathVariable("studentId") long studentId, @ModelAttribute("student") Student student, Model model) {
		Student oldStudent = studentServiceImpl.getStudentById(studentId);
		oldStudent.setStudentId(student.getStudentId());
		oldStudent.setStudentName(student.getStudentName());
		oldStudent.setStudentEmail(student.getStudentEmail());
		this.studentServiceImpl.editStudent(oldStudent);
		return "redirect:/api/students";
	}
	
	@GetMapping("/api/students/{studentId}")
	public String deleteStudent(@PathVariable("studentId") long studentId) {
		studentServiceImpl.deleteStudent(studentId);
		return "redirect:/api/students";
	}
}
