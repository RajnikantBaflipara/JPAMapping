package com.example.rajnish.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String studentName;

	@ManyToOne
	@JoinColumn(name="college_id")
	private Address address;

	public Student() {
	}

	public Student(String studentName, Address address) {
		this.studentName = studentName;
		this.address=address;
	}

	public long getStudentId() {
		return this.id;
	}

	public void setStudentId(Long studentId) {
		this.id = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getStudentAddress() {
		return address;
	}

	public void setStudentAddress(Address studentAddress) {
		this.address = studentAddress;
	}
}

