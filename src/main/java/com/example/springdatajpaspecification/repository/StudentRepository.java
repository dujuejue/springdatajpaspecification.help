package com.example.springdatajpaspecification.repository;

import com.example.springdatajpaspecification.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {
}
