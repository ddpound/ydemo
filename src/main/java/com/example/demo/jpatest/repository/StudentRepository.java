package com.example.demo.jpatest.repository;

import com.example.demo.jpatest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Integer> {


}
