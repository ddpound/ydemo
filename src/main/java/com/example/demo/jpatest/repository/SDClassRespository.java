package com.example.demo.jpatest.repository;

import com.example.demo.jpatest.model.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SDClassRespository extends JpaRepository<StudentClass, Integer> {
}
