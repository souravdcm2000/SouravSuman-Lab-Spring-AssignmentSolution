package com.sourav.StudentManagementBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sourav.StudentManagementBoot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
