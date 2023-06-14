package com.springbootapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_Student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long studentId=1;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_email")
	private String studentEmail;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long studentId, String studentName, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
}
