package com.sourav.StudentManagementBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="student")
@Getter
@Setter
public class Student {

	// Define fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="department")
	private String department;
	
	@Column(name="country")
	private String country;
	
	// Define constructors
	public Student() {
		
	}

	public Student(String name, String department, String country) {
		super();

		this.name = name;
		this.department = department;
		this.country = country;
	}
	
}
